// 抽象クラス
abstract class Human(var name: String) {
    // overrideを強制する
    // 具体的なメソッドを書くことはできない！！
    abstract fun intro()
}
// ポリモーフィズムを実現するために必要。ただし本講義では扱わない

class TekitoHuman(name: String): Human(name) {
    override fun intro() {
        println("とうも、レオナルド・ディアカプリオです。")
    }

}

fun main() {
    val takada = TekitoHuman("高田")
    takada.intro()
}
