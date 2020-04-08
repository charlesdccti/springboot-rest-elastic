#!/usr/bin/env bash

index_name_alias=deprivation_index
activities_file=municipios_19_02_2020.json

curl -X GET localhost:9200/${index_name_alias}/municipality/_search