package model

// これ自体がインスタンスとして機能する
object AppInfo {
    var name: String = "RPG GAME"

    fun display() {
        println(name)
    }
}