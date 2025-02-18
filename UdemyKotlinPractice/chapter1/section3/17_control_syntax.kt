fun main() {
    // val a = 10
    // if (a <= 5) {
    //     println("a is less than or equal to 5")
    // } else if (a <= 10) {
    //     println("a is less than or equal to 10")
    // } else {
    //     println("a is bigger than 10")
    // }

    // kotlinにおいてifは式。結果を代入できる
    // このときelseは省略できない
    val a: Int = 10
    var msg: String = if (a <= 5) {
        "a is less than or equal to 5"
    } else if (a <= 10) {
        "a is less than or equal to 10"
    } else {
        "a is bigger than 10"
    }
    println(msg)

    val b: Int = 10
    val msg2 = if (b <= 5) "aは５以下" else if (a <= 10) "aは10以下" else "aは10より大きい"
    println(msg2)
    
}