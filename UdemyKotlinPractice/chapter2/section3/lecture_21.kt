fun main() {
    //可変長引数
    println(union(1, 2, 3, 4, 7, 8, 9))
    val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println(union(*intArray))
}

fun union(vararg array: Int): String {
    var str = ""

    for(num: Int in array)
        str += num
    
    return str
}