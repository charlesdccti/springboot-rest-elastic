#!/usr/bin/env bash

index_name_alias=deprivation_index
activities_file=municipios.json

curl -X POST localhost:9200/${index_name_alias}/municipality -H "Content-Type: application/json" --data-binary @${activities_file}
echo