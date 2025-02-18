fun main() {
    val array: Array<Int> = arrayOf(10, 20, 30)
    println(array[0])
    println(array[1])
    println(array[2])
    // println(array[3])
    array[0] = 100
    println(array[0])

    array.forEach { println(it) }

    val array1: IntArray = intArrayOf(10, 20)

    val array2: DoubleArray = doubleArrayOf(10.0, 20.0)

    val array3 = arrayOfNulls<String>(5)
    array3.forEach { println(it) }
    
}