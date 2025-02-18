fun main() {
    val x = 1
    when (x) {
        1 -> println("xは1")
        2 -> println("xは2")
        else -> {
            println("xは1でも2でもない")
        }
    } 

    // if式と同様に「式」として扱うことが可能

    val score = 100
    val msg = when(score) {
        100, 99 -> "素晴らしい"
        in 60..98 -> "合格"
        !in 60..100 -> "不合格"
        else -> "不正な点数"
    }
    print(msg + "\n")

    // is演算子
    val obj: Any = "あいうえお"
    when (obj) {
        is String -> println("文字数は${obj.length}です。型は${obj::class}") // stringのチェックを行ったので、スマートキャストという暗黙の型変換が起こっている
        else -> println("String型ではない型です。")
    }

    // if式の代替
    val a = 10
    when {
        a <= 5 -> println("aは5以下")
        a <= 10 -> println("aは10以下")
        else -> println("aは10より大きい")
    }

    // 設計書の方針では「どちらか一方を使う」のように方針を決める必要がありそう。一貫性のため。
}