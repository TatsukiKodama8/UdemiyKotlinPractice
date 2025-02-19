package model

class Enemy(name: String, hp: Int, var def: Int): Character(name, hp) {
    override fun showStatus() {
        println("名前: $name")
        println("HP: $hp")
        println("某行力: $def")
    }
}