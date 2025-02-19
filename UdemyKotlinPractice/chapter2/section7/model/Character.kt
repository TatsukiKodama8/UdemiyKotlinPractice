package model

// スーパークラス
open class Character(val name: String, var hp: Int) {
    open fun showStatus() {
        println("名前：${name}")
        println("HP：${hp}")
    }
}