fun main() {
    val x = 10
    val y = 1.0
    val z = "hello"
    println("x = ${x::class}")
    println("y = ${y::class}")
    println("z = ${z::class}")

    // 整数のデータ型（４種類）
    val num1: Int = 10      // 32 bitのデータサイズ
    // val num2: Long = 10     // 64 bitのデータサイズ
    val num2 = 10L     // 64 bitのデータサイズ
    val num3: Short = 10    // 16 bitのデータサイズ
    val num4: Byte = 10     // 8  bitのデータサイズ
    println("num2 = ${num2::class}")

    // 少数
    val num5: Double = 1.0 // 64 bit
    val num6: Float = 1.0F // 32 bit（数値計算では使ってはならない）

    // 整数（符号なし）
    //val num: Byte = 255 // 符号付きなので127までしか代入できない
    val num7: UByte = 255U
    println("num7 = ${num7::class}")

    // 進数表現
    val base_num1 = 0xF0
    val base_num2 = 0b1111_0000 // _は見やすさのため
    println(base_num1)
    println(base_num2)


    // 文字列 文字
    val str: String = "hello"
    val ch: Char = "S" // 1文字のみ
    println("base_num1 = ${base_num1::class}")
    println("base_num2 = ${base_num2::class}")

    // 真偽 Boolean
    val bool: Boolean = true
    println(10 > 5)
    println(bool)

    // Any
    var any: Any = 10
    any = "qwertyui"
    any = 'C'
}