// Pair型の戻りを定義した関数
fun getSumAverage(vararg values: Int): Pair<Int, Double> {
    var result = 0
    var count = 0.0
    for (value in values) {
        result += value
        count ++ // increment
    }
    return Pair(result, result / count) // Pairクラスのコンストラクタに2値を渡す
}

fun main() {
    // 分解宣言という↓
    val (sum, average) = getSumAverage(3, 4, 8, 1)
    println(sum) // 16.0
    println(average) // 4.0
}



























