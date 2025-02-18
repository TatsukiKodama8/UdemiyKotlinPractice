// kotlinでは多重継承（複数のクラスを継承した派生クラスの定義）が禁止されている
// →単一継承

// これで生じる問題

// HogeAとHogeBという２つのクラスがある
// それぞれのクラスにおいて抽象メソッドによって、
// HogeAクラスはhoge1メソッドとhoge2メソッド、
// HogeBクラスはhoge2メソッドとhoge3メソッドの実装を強制したいとする

// hoge2はまとめたほうが良さそう

// ↓これは問題が発生
// 必要のないメソッドまで強制される
// abstract class Hoge {
//     abstract fun hoge1()
//     abstract fun hoge2()
//     abstract fun hoge3()
// }

// class HogeA: Hoge() {
//     override fun hoge1()
//     override fun hoge2()
//     override fun hoge3()
// }
// class HogeB: Hoge() {
//     override fun hoge1()
//     override fun hoge2()
//     override fun hoge3()
// }

// abstractという修飾子は必要ない→interfaceの中には基本的に抽象メソッドが定義されるので
interface Hoge1 {
    fun hoge1()
}

interface Hoge2 {
    fun hoge2()
}

interface Hoge3 {
    fun hoge3()
}

class HogeA: Hoge1, Hoge2 {
    override fun hoge1() {}
    override fun hoge2() {}
}

class HogeB: Hoge2, Hoge3 {
    override fun hoge2() {}
    override fun hoge3() {}
}

// これを実務レベルで使うべきか？？

// interface インターフェイス名 {定義}
// Pythonは多重継承が許されているので、インターフェイスは用意されていない

// 継承と実装を同時に行うことも可能
// class Child: Parent(), MyInterface {...}

// 【interfaceとabstract classの違い】
// interface → constructorをもてない
// interface → プロパティはカスタムアクセさーを持つものか、抽象プロパティしかもてない
// interface　→ abstractやopen修飾子は不要（自明のため））

// デフォルトの実装を持たせることも可能
// interface MyInterface {
//     fun bar()
//     fun foo() = println("foo")
// }

// class Bar: MyInterface {
//     override fun bar () = println("bar")
//     // fooはoverrideする必要なない
// }

//

// interface Hoge1 {
//     fun hoge() = println("hoge1")
// }

// interface Hoge2 {
//     fun hoge() = println("hoge2")
// }

// class MyClass: Hoge1, Hoge2 {
//     override fun hoge() {
//         super<Hoge1>.hoge()
//         super<Hoge2>.hoge()
//     }
// }

//
interface FooInterface {
    var foo: String
    fun foo() = println(foo)
}

class Foo: FooInterface {
    override var foo = "foo"
}

// バッキングフィールドをもてないの
interface MyInterface {
    var price: Int
    val taxIncludePrice: Int
        get() = (this.price * 1.1).toInt()
    fun checkPrice() {
        println("税込み${taxIncludePrice}円です")
    }
}

class Price: MyInterface {
    override var price = 100
}

fun main() {
    val price = Price()
    price.checkPrice()

    // val foo = Foo()
    // foo.foo() // 結果
}
