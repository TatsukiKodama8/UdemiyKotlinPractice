#!/bin/bash
filename="${1%.kt}"  # .kt を取り除く

# `model` ディレクトリ内の全 `.kt` ファイルもコンパイル対象
kotlinc "$filename.kt" model/*.kt -include-runtime -d "$filename.jar"

# コンパイルが成功した場合のみ実行
if [ $? -eq 0 ]; then
    kotlin "$filename.jar"
else
    echo "Compile error"
fi
