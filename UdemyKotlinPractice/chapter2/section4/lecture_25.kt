fun main() {
    // 関数を渡せる
    val func = ::calcA
    println(func(10, 5))

    // 高階関数
    val n1 = calcB(5, 10, ::calcA)
    println("n1 = $n1")

    // ラムダ式
    // 中かっこが最後の引数→外に出せる
    val n2: Int = calcB(5, 10) {x: Int, y: Int -> x + y}
    println("n2 = $n2")

    // it
    val num = funcB(10) {it + 1}
    println(num)
}

fun calcA(a: Int, b: Int) = a + b

// Cの関数ポインタみたい
fun calcB(a: Int, b: Int, func: (Int, Int) -> Int) = func(a, b)

fun funcA(a: Int) = a + 1

fun funcB(a: Int, func: (Int) -> Int) = func(a)