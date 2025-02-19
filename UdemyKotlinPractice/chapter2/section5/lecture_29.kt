import model.* // ワイルドカード

fun main() {
    // プライマリコンストラクタ
    // プロパティ宣言

    val p1 = Character("プレイヤー1", 100)
    p1.showStatus()

    val p2 = Character("プレイヤー2", 200)
    p2.showStatus()
}