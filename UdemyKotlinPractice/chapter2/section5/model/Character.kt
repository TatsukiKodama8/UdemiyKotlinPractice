package model // 自分が所属パッケージを表す

// クラス名の後ろに書くconstructor→primary constructor
class Character(val name: String = "PLAYLR", val hp: Int = 10) {
    fun showStatus() {
        println("名前: $name")
        println("HP: $hp")
    }
    // var name: String = "NO NAME"
    //     set(value) {
    //         field = if(value == "") {
    //             println("名前が正しくありません")
    //             // バッキングフィールドと呼ばれるもの
    //             // ここではnameの役割をする
    //             "NO NAME"
    //         } else {
    //             value
    //         }
    //     }
    //     get() = field + "さん"
    // var hp: Int

    // val length: Int
    //     get() = return name.length

    // constructor(name: String, hp: Int) {
    //     this.name = name
    //     this.hp = hp
    // }

    // // メソッド＝クラス内の関数（語弊あり？？）
    // fun showStatus() {
    //     println("名前：$name")
    //     println("HP：$hp")
    // }

    // プロパティ宣言のため↓は省略可能
    // // プロパティ＝クラスが持つ情報
    // var name: String
    // var hp: Int

    // // コンストラクに値を渡した後に最初に実行される処理
    // init {
    //     this.name = name // this.xxでクラス内のプロパティを表す
    //     this.hp = hp
    // }

    // constructor(name: String): this(name, 50) {
    //     println("** secondary **")
    // }
    // constructor(hp: Int): this("プレイヤー3", hp)
    // constructor(): this("プレイヤー4", 10)
}