// === 拡張関数 ===
// 継承を用いずに既存のクラスにメソッドを追加できる
// 拡張関数を使えばopenでないクラスに対してもメソッドも追加できる

// fun 拡張するクラス名.追加メソッド名(仮引数: 型, ..): 戻り値の型 {処理}

fun String.repeat(n: Int): String {
    var builder = StringBuilder()
    for (i in 1..n) {
        builder.append(this) // pythonみたい
    }
    return builder.toString()
}

fun main () {
    val hoge = "ほげ"
    println(hoge.repeat(3)) // ほげほげほげ
}
