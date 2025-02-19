fun main() {
    // オブジェクト指向
    // プロパティとメソッドをまとめて管理
    
    // 左辺＝インスタンス
    val player = Character()
    player.showStatus() // playerインスタンスがshowStatusメソッドを実行

}

class Character {
    // プロパティ＝クラスが持つ情報
    var name: String = "主人公"
    var hp: Int = 100

    // メソッド＝クラス内の関数（語弊あり？？）
    fun showStatus() {
        println("名前：$name")
        println("HP：$hp")
    }
}