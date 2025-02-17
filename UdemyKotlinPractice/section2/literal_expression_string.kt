fun main() {
    var msg1 = "こんにちは。\n私はKotlinを学んでいます\n" // escaped string
    var msg2 = """こんにちは。 
    |私はKotlinを学んでいます。""".trimMargin() // 行頭のインデントを消去。先頭にはパイプ

    print(msg1)
    print(msg2)

    // 文字列テンプレート
    var data = arrayOf(1, 2, 3)
    println("配列dataの先頭の値は${data[0]}で、要素数は${data.size}です。")
    println("1+1は、${1+1}です。")

}