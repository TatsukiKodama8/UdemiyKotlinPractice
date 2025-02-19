fun main() {
    /**
    if 条件分岐
     */
    val num = 120

    // 上から順番に処理することに注意
    val str = if (num > 50) {
        "num > 50"
    } else if (num > 100) {
        "num > 100"
    } else {
        "otherwise"
    }
    print(str)

}