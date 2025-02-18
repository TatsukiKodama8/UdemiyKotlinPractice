// kotlinではclassの中にclassを定義することができる
// これをネストクラスと呼ぶ


// Outer→Nestedに強く依存
// Nested→Outerからしか呼ばれない
// 上記の使用の場合に効力を発揮する
// class Outer {
//     // privateという修飾子によってOuterからしかアクセスできない
//     private class Nested {
//         fun show() = println("Nested is running")
//     }

//     fun run() {
//         val nested = Nested() // インスタンス生成
//         nested.show()
//     }
// }

class Outer(val name: String = "Outer") {
    inner class Nested (val name: String = "Nested") {
        fun show() {
            println("${this@Outer.name} called show()") 
            println("$name is running")
        }
    }

    fun run() {
        val nested = Nested() // インスタンス生成
        nested.show()
    }
}

fun main () {
    val o = Outer()
    o.run() // "Outer called show()" "Nested is running"
}
