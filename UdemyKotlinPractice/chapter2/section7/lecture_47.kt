fun main() {
    val numList: List<Int> = listOf(1, 2, 3, 4, 5)
    val x: Int = getMiddle<Int>(numList)
    println(x)

    var strList: List<String> = listOf<String>("1", "2", "3", "4", "5")
    println(getMiddle<String>(strList))

}

fun <T> getMiddle(list: List<T>): T {
    return list[list.size / 2]
}