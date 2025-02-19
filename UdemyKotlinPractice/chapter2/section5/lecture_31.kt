import model.* // ワイルドカード

fun main() {
    // アクセッサ（get: getter, set: setter）
    // >> 代入時・取得時に自動的に呼ばれる
    // バッキングフィールド（　field　）

    val p1 = Character("田中", 100)
    p1.showStatus()

    // ただの代入に見えるが、内部的にはsetterを使用している。
    // それを少し拡張してみよう
    println(p1.name)
    println(p1.length)

    
}