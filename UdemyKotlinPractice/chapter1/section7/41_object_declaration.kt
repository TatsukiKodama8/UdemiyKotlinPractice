// 開発の場面ではひとつのインスタンスしかもたないようなクラスを用意したいことがある
// →　デザインパターン：Singletonパターン
// Kotlinはオブジェクト宣言という仕組みがある
// 基本的な書き方は
// object オブジェクト名 { オブジェクト本体 }

object TanakaTaro {
    val name = "田中太郎"
    var clothe = "Tシャツ"

    fun intro() {
        println("${name}は${clothe}を着ている。")
    }
}

fun main() {
    TanakaTaro.clothe = "Yシャツ"
    TanakaTaro.intro()
}
