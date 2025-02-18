// class クラス名　constructor(引数: データ型) {}

class Human constructor (var name: String, var age: Int){
    // ↑varをつけることで↓のコメントアウトの内容を無視できる
    
    // var name: String
    // var age: Int

    // // コンストラクで受け取った引数はinitブロックで初期化される
    // // コンストラクとプロパティの名前が等しいとき、クラスがもつことを示すためにthis.をつける
    // init {
    //     this.name = name
    //     this.age = age
    // }
       
    fun intro() {
        println("私の名前は${this.name}です。${this.age}歳です。")
    }
}


fun main() {
    val taro = Human("太郎", 10)
    taro.intro()
}
