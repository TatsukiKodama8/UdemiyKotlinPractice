fun main() {
    /**
    ループ制御
     */

    // break
    for(i in 0..10) {
        if(i == 5) {
            break
        }
        println(i)
    }
    println()

    // continue -> スキップする
    for(i in 0..10) {
        if(i%2 == 0) {
            continue
        }
        println(i)
    }
    println()

    // 2重
    for(i in 0..10) {
        for(j in 0..10) {
            if(j == 5) {
                break
            }
            print(j)
        }
        println()
    }
    println()

    // 外に抜ける
    outer@for(i in 0..10) {
        for(j in 0..10) {
            if(j == 5) {
                break@outer
            }
            print(j)
        }
        println()
    }



}