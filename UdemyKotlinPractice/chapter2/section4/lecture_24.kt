fun main() {
    val (sum, max, min) = sumMaxMin(20, 10, 50, 30, 40)
    println("sum = $sum") 
    println("max = $max") 
    println("min = $min") 

    val triple: Triple<Int, Int, Int> = sumMaxMin(20, 10, 50, 30, 40)
    println("first = ${triple.first}") 
    println("second = ${triple.second}") 
    println("third = ${triple.first}") 
}

fun sumMaxMin(vararg array: Int): Triple<Int, Int, Int> {

    var sum = 0
    var max = array[0]  // 最初の要素を初期値にする
    var min = 10

    for (num in array) {
        sum += num
        if (max < num) 
            max = num
        if (min > num)
            min = num
    }

    return Triple(sum, max, min)
}
