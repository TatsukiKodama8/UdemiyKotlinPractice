fun main() {
    // ラムダ式
    val n2: Int = calcB(5, 10) {x: Int, y: Int -> x + y}
    println("n2 = $n2")

    // 無名関数
    // 返却する返りの値の型を指定できるのがラムダ式との違い
    val num = calcB(5, 10, fun(x: Int, y: Int): Int = x + y)
    println(num)
}

// Cの関数ポインタみたい
fun calcB(a: Int, b: Int, func: (Int, Int) -> Int) = func(a, b)