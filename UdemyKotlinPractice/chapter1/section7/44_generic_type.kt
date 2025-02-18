// ジェネリック（プログラミング）とは
// 具体的なデータ型に依存しない、抽象的かつ汎用的なコード記述を可能にする手法

// ジェネリックプログラミングの思想
// ここでTは型引数（Tは何でもいいが、慣例的にTと書いている）
class genericExample<T>(var value: T) {
    fun getProp(): T {
        return value
    }
}

fun main () {
    val g1 = genericExample<String>("foo")
    val g2 = genericExample<Int>(1)
    val g3 = genericExample("hoge") // 型推論ができるなら省略可能
    println(g1.getProp())
    println(g2.getProp())
    // g1.value = 1 // エラー

    // 型引数を複数与えることも可能
    var map: Map<String, Int> = mapOf("First" to 1, "Second" to 2)
    // 定義時はclass クラス名 <T, E>

    // 渡せる型を制限する場合
    // e.g., 型引数のあとに書いたクラス、もしくその派生クラスに型を制限できる
    open class Hoge() {} // 継承可能なクラス
    class Foo(): Hoge() { // Hogeクラスを継承したクラス
        val foo = "foo"
    }

    class Generic<T: Hoge>(var obj: T) {
        fun getProp(): T {
            return obj
        }
    }

    val gg1 = Generic<Foo>(Foo())
    println(gg1.getProp().foo)
    // val g2 = Generic<String>("foo") // エラー

}