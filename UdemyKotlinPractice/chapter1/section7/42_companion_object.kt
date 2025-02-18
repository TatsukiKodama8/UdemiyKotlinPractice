// コンパニオンオブジェクト
// Staticメンバ（インスタンス化せずともアクセスできる）

class MyClass {
    // インスタンス化されていなくても使えるメソッド
    // Factoryは省略可能
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

fun main() {
    val my = MyClass.create() // インスタンス化しなくてもメソッドを呼び出せる
    println(my::class)
}