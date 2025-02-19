fun main() {

    //　算術演算子
    val a = 10
    val b = 3
    println("a + b = ${a + b}")
    println("a + b = ${a - b}")
    println("a + b = ${a * b}")
    println("a + b = ${a / b}")
    println("a + b = ${a % b}")
    println()

    // 比較演算子
    val x = 10
    val y = 20
    println(x < y)
    println(x <= y)
    println(x > y)
    println(x >= y)
    println(x == y)
    println(x != y)
    println()

    // 論理演算子
    val z = 10
    println(z > 5 && z < 20)
    println(z > 5 || z < 20)
    println(!(z > 5))
    println(!(true))
    println()

    // 範囲演算子
    val n1 = 10
    val n2 = 20
    val array: Array<Int> = arrayOf(n1, n2)
    println(15 in n1..n2)
    println(15 !in n1..n2)
    println(15 in array)
    println("B" in "ABC")

}