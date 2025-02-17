// ラムダ式ではなく直上の関数を抜けてしまうので、「ラムダ式を終了しました」と表示されない
// fun main() {
//     val arr = arrayOf(1, 2, 3, 4) 
//     arr.forEach {
//         if (it == 3) return 
//         println(it)
//     }
//     println("ラムダ式を終了しました")
// }

fun benchmark(unitStr: String, func: ()-> Unit): String {
    val start = System.currentTimeMillis()
    func()
    val end = System.currentTimeMillis()
    return (end - start).toString() + unitStr
}

// なんかCのgoto文みたい
fun main() {
    val arr = arrayOf(1, 2, 3, 4) 
    arr.forEach {
        if (it == 3) return@forEach
        println(it)
    }
    println("ラムダ式を終了しました")

    val time = benchmark("ミリ秒") {
        var x = 0
        for (i in 1..1_000_000_000) {
            x++
        }
    }
    println("処理時間" + time)
}

