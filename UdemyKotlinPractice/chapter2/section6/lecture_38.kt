import model.*

fun main() {
    val p = Player("Player", 100, 10, 10)

    // === up cast === 
    // サブクラスをスーパークラスに代入
    val ch: Character = p
    println(ch::class) // class model.Player
    ch.showStatus() // Playerクラスが実行されている

    // ch.attack()　エラー　attackはCharacterクラスからoverrideされていないので

    // === down cast ===
    val player: Player = ch as Player
    player.attack()

    val c = Character("character", 100) // 攻撃力のプロパティが存在しないためdown castが成立しない
    val player2: Player = c as Player
    player2.attack()

    // === smart cast ===
    if(ch is Player) {
        // if式の中ではchはPlayer型
        ch.attack()
        val pp: Player = ch // asを指定しなくてもよい
    }
}