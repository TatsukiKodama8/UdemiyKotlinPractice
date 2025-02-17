fun main(){

    // 可変長引数は内部的には配列とみなされる
    fun allSum(vararg values: Int): Int {
        var result = 0
        for (value in values) {
            result += value
        }
        return result
    }
    println(allSum(2, 3, 1, 7)) // 13

    var arr = intArrayOf(2, 3, 1, 7) // これ自体は可変長引数では扱えない
    println(allSum(*arr)) // 13 (スプレッド演算子。配列の要素を可変長引数に渡すことができる)
    println(arr)
    println(allSum(4, *arr, 3)) // 20

}
