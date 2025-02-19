import model.*

fun main() {
    val p = Player("Player", 100, 10)
    val e = Enemy("Enemy", 50, 5)

    val list: List<Character> = listOf(p, e)

    for(obj in list) {
        println("== ${obj::class} ==")
        obj.showStatus() // ポリモーフィズム
    }
}