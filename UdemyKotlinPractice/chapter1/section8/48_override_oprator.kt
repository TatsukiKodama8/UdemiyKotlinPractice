// 演算子のオーバーロード

// a + b →　a.plus(b)
// a == b →　a.equals(b)

// オーバーロード
// 引数の型や数が異なっていれば同じ名前のメソッドを定義することができる
// オーバーライド
// 既存クラスのメソッドをサブクラスのメソッドで上書きする
// 演算子のオーバーロード

class Coordinate(val x: Double, val y: Double) {
    // 修飾子によって演算子に対するオーバーロードを明示している
    operator fun plus(c: Coordinate): Coordinate {
        return Coordinate(this.x + c.x, this.y + c.y)
    }
}

fun main() {
    val c1 = Coordinate(1.0, 2.0)
    val c2 = Coordinate(0.5, 1.5)
    val c3 = c1 + c2
    println("Coordinate: ${c3.x}, ${c3.y}")
}
