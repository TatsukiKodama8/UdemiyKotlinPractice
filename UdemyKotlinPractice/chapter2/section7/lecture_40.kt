import model.*

fun main() {
    AppInfo.display()

    AppInfo.name = "ZZ GAME"

    AppInfo.display()

    // val app = AppInfo() // エラー
    val app = AppInfo
    app.name = "XX GAME"
    app.display()
}