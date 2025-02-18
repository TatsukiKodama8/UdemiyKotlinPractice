// 継承元
// Kotlinではopenという修飾子
// methodのoverride可能なことを表すのもopenという修飾子
open class Human(var name: String) {
    open fun intro() {
        println("私の名前は${this.name}です。")
    }
}


class PerfectHuman(name: String, var place: String): Human (name) {
    override fun intro() {
        println("${this.name}! ${this.name}! I'm a perfect human.")
        super.intro()
    }
    fun liveIn() {
        println("We live in ${this.place}.")
    }
}

fun main() {
    val nakata = PerfectHuman("Nakata", "Tokyo")
    nakata.liveIn()
    nakata.intro()
}

// overrideを強制する
// polimorphyism??