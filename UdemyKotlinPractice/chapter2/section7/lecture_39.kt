import model.*

fun main() {
    // 再利用することのない一時的に使用するクラス
    val weakPlayer = object: Player("モブ", 10, 1, 1) {
        override fun attack() {
            println("失敗！！")
        }
    }

    weakPlayer.attack()
}