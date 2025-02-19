fun main() {
    // 変数
    var num = 10
    println("num = $num")
    println(num::class)

    var str = "Hello"
    println("str = $str")
    println(str::class)

    num = 20
    println(num)

    // num = "Hello" エラー

    // 定数
    val x = 10
    // x = 20 でエラー
}