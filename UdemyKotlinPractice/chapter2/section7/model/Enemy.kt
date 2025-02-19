package model

class Enemy(name: String, hp: Int, var def: Int): Character(name, hp) {

    // インスタンスの作成回数がわかる
    init {
        count++
    }

    companion object {
        var count = 0
        fun showCount() {
            println(count)
        }
    }
    override fun showStatus() {
        println("名前: $name")
        println("HP: $hp")
        println("某行力: $def")
    }
}