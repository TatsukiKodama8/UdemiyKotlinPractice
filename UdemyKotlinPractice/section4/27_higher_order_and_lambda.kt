// 高階関数（引数として関数、戻り値として関数を返す関数のこと）
fun hyoji(n: Int) {
    println(n)
}

fun main() {
    println("高階関数")
    var arr = arrayOf(1, 2, 3, 4)
    // 関数のj引数に関すを渡すには::演算子を用いる
    // forEachメソッド：arrの要素が順々にhyojiという関数に渡されておる
    // forEachメソッドは高階関数の一例
    arr.forEach(::hyoji)

    println("ラムダ式")
    // 高階関数の引数として渡される関数
    // わざわざ宣言する必要がないことが多い→匿名関数（ラムダ式）
    // {引数 -> 関数本体の処理}
    val arr2 = arrayOf(1, 2, 3, 4)
    arr.forEach({ n: Int -> println(n) })
    arr.forEach({ n -> println(n) }) // 引数の方が推論できる場合
    arr.forEach(){ n: Int -> println(n) } // 高階関数の唯一のラムダ式なら
    arr.forEach{ n: Int -> println(n) }
    // ラムダ式の引数が単一なら、暗黙な引数itで受け取れる
    arr.forEach{ println(it) }
}



























