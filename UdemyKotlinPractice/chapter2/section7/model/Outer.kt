package model

class Outer(val num: Int) {
    // 遅れて初期化する
    lateinit var obj: Inner

    fun innerCreateReturn(num: Int): Inner {
        // インナークラスを生成して返却する
        return Inner(num)
    }

    fun innerCreate(num: Int) {
        // インナークラスを生成してプロパティに代入する
        obj = Inner(num)
    }

    fun display() {
        println("Outer = $num")
    }

    inner class Inner(val num: Int) {
        fun display() {
            // 外側のクラスのプロパティにアクセスする
            println("@Outer = ${this@Outer.num}")
            println("Inner = $num")
        }
    }
}