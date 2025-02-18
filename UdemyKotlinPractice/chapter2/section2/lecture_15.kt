fun main() {
    /**
    when 多岐分岐
     */

    val num: Any = 50.0

    val str = when(num) {
        5 -> "num = 5"
        6, 7 -> "num = 6 or 7"
        in 11..20 -> "num = 11 ~20"
        else -> {
            println("otherwise")
            "当てはまりません"
        }
    }
    println(str)

    when(num) {
        is Int -> print("Int")
        is Double -> println("Double")
        is String -> println("String")
    }

}
