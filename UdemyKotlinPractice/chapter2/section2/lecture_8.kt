fun main() {
    /**
    null安全性
    null 許容型
    null 非許容型
     */

    // ? セーフコール演算子
    val str: String? = null
    println(str?:"".length) // エルビス演算子?:

    // !!
    val list: MutableList<Int> = mutableListOf(10, 20, 30)
    val num: Int? = list.min()
    // print(num * 2) //  算術演算子はnull許容型を計算できない
    // スマートキャスト。冗長だが安全
    if (num != null) {// コードブロックの中では自動でnull非許容型にキャストされる
        println(num * 2)
    }

    // !!
    // ただしリストがnullの場合にはエラーが発生する
    val numm: Int = num!!
    print(numm * 2)


}