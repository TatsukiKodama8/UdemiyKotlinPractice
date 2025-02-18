fun main() {
    val arr = arrayOf(1, 2, 3)
    for (item in arr) {
        println(item)
    }

    // mapにも使用できる
    val map = mapOf("First" to 1, "Second" to 2, "Third" to 3)
    for ((key, value) in map) {
        println("${key}: ${value}")
    }

    // withIndexメソッド→pythonのenumerateと一緒
    val list = listOf("あ", "い", "う")
    for ((index, value) in list.withIndex()) {
        println("${index}: ${value}")
    }

    // 範囲演算子を用いれば指定した回数繰り返すことも可能
    for (i in 1..3) {
        println(i)
    }

    // 最後の量を含めない→ until（pythonでいうrange(0, 3)）
    for (i in 1 until 3) {
        println(i)
    }

    // デクリメント
    for (i in 3 downTo 1) {
        println(i)
    }

    // 3ずつ増やす
    println("3ずつ増やす")
    for (i in 1..10 step 3) {
        println(i)
    }

     // ループの中断にはbreak、スキップするにはcontinue
    println("ループの中断にはbreak、スキップするにはcontinue")
    for (i in 1..10) {
        if (i % 3 == 0) continue
        println(i)
        if(i == 8) break
    }

    // 入れ子。内側のループだけ抜ける
    println("入れ子")
    for (i in 1..3) {
        for (j in 1..3) {
            if (i * j > 5) break
            print("${i * j} ")
        }
        println()
    }

    // ラベル構文
    println("ラベル構文")
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (i * j > 5) break@outer
            print("${i * j} ")
        }
        println()
    }
    // ラベル名@をforの前につける。ラベル名は任意
    // break/continueの後ろに「break@ラベル名」
}