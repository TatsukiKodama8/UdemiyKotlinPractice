fun main() {
    /**
    for
    配列
     */
    
    // 配列
    val fruits: Array<String> = arrayOf("りんご", "みかん", "ぶどう")

    for (fruit: String in fruits) {
        println(fruit)
    }

    val place_list: List<String> = listOf<String>("東京", "大阪", "京都")

    for ((index, place) in place_list.withIndex()) {
        println("${index} = ${place}")
    }

    for (index in place_list.indices) {
        println(place_list[index])
    }

    // マップ
    val map: Map<Int, String> = mapOf<Int, String> (
        1 to "one", 
        2 to "two", 
        3 to "three"
    )

    for((key: Int, value: String) in map) {
        println("$key = $value")
    }
}