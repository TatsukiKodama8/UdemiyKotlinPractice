fun main() {
    val str: String = sayMessage("hello")
    println(str)

    val strr: String = unionString("hello", "world")
    println(strr)
}

fun sayMessage(str: String): String {
    return "Message = ${str}"
}

// 単一式関数
fun unionString(str1: String, str2: String) = str1 + str2