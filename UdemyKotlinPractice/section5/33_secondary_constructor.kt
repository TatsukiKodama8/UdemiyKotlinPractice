// class Human constructor (var name: String, var age: Int){
//     constructor(name: String): this(name, 10) {} // 1つめのsecondary constructor
//     // このthisはこのクラスprimary constructorを呼び出している
//     // this=Human
//     constructor():this("太郎") {} // ２つ目のsecondary constructor
       
//     fun intro() {
//         println("私の名前は${this.name}です。${this.age}歳です。")
//     }
// }

// secondary constructorとはある種、デフォルト値を与えているが、下記のようにも書ける。まだ有用性がわからない。
// より柔軟な初期値の設定
// Javaとの相互運用性を高める（Javaはデフォルト値を与えられない）

// ※必ず、最終的にprimary constructorを呼び出さなければならない

// こっちはデフォルト値で対応したもの
class Human constructor (var name: String = "太郎", var age: Int = 10){
    fun intro() {
        println("私の名前は${this.name}です。${this.age}歳です。")
    }
}


fun main() {
    val human1 = Human("三郎", 5) // primary constructorに渡される
    val human2 = Human("次郎")
    val human3 = Human()
    human1.intro()
    human2.intro()
    human3.intro()
}
