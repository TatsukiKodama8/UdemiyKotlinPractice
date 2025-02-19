import model.* // ワイルドカード

fun main() {
    // セカンダリコンストラクタ：複数定義可能
    // プライマリコンストラクタも定義されている場合には、最終的にプライマリコンストラクタを呼び出す
    // this: 他のコンストラクタを呼び出す

    val p1 = Character("プレイヤー1", 100)
    p1.showStatus()

    val p2 = Character("プレイヤー2")
    p2.showStatus()

    val p3 = Character(500)
    p3.showStatus()

    val p4 = Character()
    p4.showStatus()
}