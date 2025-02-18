// Kotlinはフィールを使うことができない
// が、だいたい手段がある

class Human {
    var name = "名無し"
    var age = 20
        set (value) {
            if (value < 0) {
                println("年齢が不正です。")
            } else {
            // アクセさーの引数は慣例的ににvalueを持つ。（なんでもいいんだけど）
            // fieldの方は予約語（backing fieldと呼ばれる）。
            // private setとするとクラス外では読み取り専用
                field = value
            }
        }

    fun intro() {
        println("私の名前は${name}です。${age}歳です。")
    }
}


fun main() {
    val human = Human()
    human.intro()
    human.age = -1
    println(human.name)
}
