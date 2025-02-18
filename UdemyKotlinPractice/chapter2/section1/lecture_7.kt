fun main() {
    // 以下のような代入はできない
    // val x: Int = 10
    // val y: Long = x
    val x: Int = 10
    val y: Long = x.toLong()

    val d: Double = x.toDouble()
    println(d)

    val dd = 1.6
    val i: Int = dd.toInt()
    println(i)
}