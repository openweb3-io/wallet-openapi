package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.exceptions.SigningException;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.signers.Ed25519Signer;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Hex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Base64;

final class Utils {
    private Utils() {
    }

    public static ApiException WrapInternalApiException(final io.openweb3.wallet.internal.ApiException e) {
        return new ApiException(e.getMessage(), e, e.getCode(), e.getResponseHeaders(), e.getResponseBody());
    }

    public static String toHex(byte[] array) {
        BigInteger bi = new BigInteger(1, array);
        String hex = bi.toString(16);
        int paddingLength = (array.length * 2) - hex.length();
        if (paddingLength > 0) {
            return String.format("%0" + paddingLength + "d", 0) + hex;
        } else {
            return hex;
        }
    }

    public static String calculateSignature(final String privateKey, final String content) throws SigningException {
        try {
            Signature sign = Signature.getInstance("SHA256withRSA");

            // replace all the new line characters and begin header and end header
            String stripPrivateKey = privateKey.replaceAll("(-+BEGIN.*-+\\r?\\n|-+END.*-+\\r?\\n?|\\n|\\r)", "");

            Base64.Decoder decoder = Base64.getDecoder();
            byte[] pkcs1Bytes = decoder.decode(stripPrivateKey);
            byte[] pkcs8Bytes = convertPkcs1ToPkcs8(pkcs1Bytes);
            PKCS8EncodedKeySpec ks = new PKCS8EncodedKeySpec(pkcs8Bytes);
            KeyFactory kf = KeyFactory.getInstance("RSA");
            RSAPrivateKey pvt = (RSAPrivateKey) kf.generatePrivate(ks);

            sign.initSign(pvt);
            sign.update(content.getBytes(StandardCharsets.UTF_8));
            byte[] data = sign.sign();
            return Base64.getEncoder().encodeToString(data);
        } catch (Exception e) {
            throw new SigningException(e.getMessage());
        }
    }

    public static boolean verify(String dataString, String signature, String publicKey)
            throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, SignatureException {

        // replace all the new line characters and begin header and end header
        String stripPublicKey = publicKey.replaceAll("(-+BEGIN.*-+\\r?\\n|-+END.*-+\\r?\\n?|\\n|\\r)", "");

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] pkcs1Bytes = decoder.decode(stripPublicKey);
        ASN1Sequence seq = ASN1Sequence.getInstance(pkcs1Bytes);
        ASN1Integer mod = (ASN1Integer) seq.getObjectAt(0);
        ASN1Integer exp = (ASN1Integer) seq.getObjectAt(1);

        RSAPublicKeySpec ks = new RSAPublicKeySpec(mod.getValue(), exp.getValue());
        KeyFactory kf = KeyFactory.getInstance("RSA");
        RSAPublicKey pk = (RSAPublicKey) kf.generatePublic(ks);

        signature = signature.replace("[\r\n]", "");
        byte[] signatureBytes = Base64.getDecoder().decode(signature);
        Signature signer = Signature.getInstance("SHA256withRSA");
        signer.initVerify(pk);
        signer.update(dataString.getBytes(StandardCharsets.UTF_8));
        return signer.verify(signatureBytes);
    }

    /**
     * convert PKCS#1 format private key byte array to PKCS#8 format
     *
     * @param pkcs1Bytes PKCS#1 format private key byte array
     * @return PKCS#8 format private key byte array
     * @throws GeneralSecurityException
     */
    private static byte[] convertPkcs1ToPkcs8(byte[] pkcs1Bytes) throws GeneralSecurityException {
        // convert PKCS#1 format private key byte array to PKCS#8 format
        int pkcs1Length = pkcs1Bytes.length;
        int totalLength = pkcs1Length + 22;
        byte[] pkcs8Header = new byte[]{
                0x30, (byte) 0x82, (byte) ((totalLength >> 8) & 0xff), (byte) (totalLength & 0xff),
                0x2, 0x1, 0x0, 0x30, 0xd, 0x6, 0x9, 0x2a, (byte) 0x86, 0x48, (byte) 0x86, (byte) 0xf7, 0xd, 0x1, 0x1,
                0x1, 0x5, 0x0, 0x4, (byte) 0x82, (byte) ((pkcs1Length >> 8) & 0xff), (byte) (pkcs1Length & 0xff)
        };
        byte[] pkcs8Bytes = new byte[pkcs8Header.length + pkcs1Bytes.length];
        System.arraycopy(pkcs8Header, 0, pkcs8Bytes, 0, pkcs8Header.length);
        System.arraycopy(pkcs1Bytes, 0, pkcs8Bytes, pkcs8Header.length, pkcs1Bytes.length);
        return pkcs8Bytes;
    }

    public static String signWithEd25519(final String hexPrivateKey, final String content) throws SigningException {

        try {
            // add BouncyCastle security provider
            Security.addProvider(new BouncyCastleProvider());

            // from OpenSSL hexadecimal private key string
            byte[] privateKeyBytes = Hex.decode(hexPrivateKey);

            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.update(content.getBytes(StandardCharsets.UTF_8));
            byte[] contentBytes = digest.digest();

            Ed25519PrivateKeyParameters keyParameters = new Ed25519PrivateKeyParameters(privateKeyBytes, 0);
            Ed25519Signer signer = new Ed25519Signer();
            signer.init(true, keyParameters);
            signer.update(contentBytes, 0, contentBytes.length);
            byte[] signedData = signer.generateSignature();

            return Hex.toHexString(signedData);
        } catch (Exception e) {
            throw new SigningException(e.getMessage());
        }
    }
}
