#!/bin/sh

set -ex

yarn swagger2openapi --outfile openapi.json swagger.json
