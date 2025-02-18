#!/bin/bash
filename="${1%.kt}"  # .kt を取り除く
kotlinc "$filename.kt" -include-runtime -d "$filename.jar"
kotlin "$filename.jar"

