fun <T> tail(arr: Array<T>): T = arr[arr.size - 1]

fun main() {
    val arr1 = arrayOf(1, 2, 3)
    val arr2 = arrayOf("あ", "い", "う")
    println(tail<Int>(arr1))
    println(tail(arr1)) // 型推論ができるとき<Int>を省略可
    println(tail<String>(arr2))
}