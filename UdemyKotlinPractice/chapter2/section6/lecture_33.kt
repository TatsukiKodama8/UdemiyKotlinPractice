import model.*

fun main() {
    // open修飾子
    var player = Player("プレイヤー", 100, 10)
    player.attack()
    player.showStatus()
}