fun main(args:Array<String>){
    var a = arrayOf(1, 2, 3) // [1, 2, 3]
    var b = intArrayOf(1, 2, 3) // [1, 2, 3] Int
    var c: Array<String?> = arrayOfNulls(3) // [null, null, null]
    var d = Array(3, {i -> i * 2}) // 要素数, 要素数の指揮（iは要素のindex）

    println(a[1])
    println(d[2])
    println(d)

    var list = listOf("あ", "い", "う")
    var set = setOf("A", "B", "A", "C", "D", "B")
    var map = mapOf("First" to 1, "Second" to 2, "Third" to 3)
    println(list) // mutableに注意
    println(set) // 重複は除外
    println(map)

    var mutable_list = mutableListOf(1, 2, 3)
    mutable_list[2] = 4
    println(mutable_list)

    var list1 = mutableListOf(1, 2, 3)
    var list2: List<Int> = list1
    // list1[2] = 4
    list2[2] = 4 // コンパイルできない
    println(list2) 
}
