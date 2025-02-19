fun main() {
    val pair: Pair<Int, Int> = sumMax(20, 10, 50, 30, 40)
    println(pair) 
    println(pair.first)
    println(pair.second)
}

fun sumMax(vararg array: Int): Pair<Int, Int> {

    var sum = 0
    var max = array[0]  // 最初の要素を初期値にする

    for (num in array) {
        sum += num
        if (max < num) {
            max = num
        }
    }

    return Pair(sum, max)
}
