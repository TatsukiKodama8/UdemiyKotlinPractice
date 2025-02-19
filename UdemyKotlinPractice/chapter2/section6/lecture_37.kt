import model.*

fun main() {
    val p = Player("Player", 100, 10, 10)

    p.showStatus()

    p.healing()

    p.showStatus()
}