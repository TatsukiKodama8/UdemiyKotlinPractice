package model

// サブクラス
open class Player(name: String, hp: Int, var atk: Int, override var heal: Int): Character(name, hp), Heal {
    open fun attack() {
        println("${name}の攻撃！${atk}のダメージ！")
    }

    override fun showStatus() {
        super.showStatus()
        println("攻撃力: $atk")
    }

    override fun healing() {
        hp += heal
        println("HP${heal}回復しました！")
    }

}