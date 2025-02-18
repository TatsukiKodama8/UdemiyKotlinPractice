// androidでは再利用を目的しないクラスを定義することがある
// そんなときに便利

// 基本の書き方
// object {クラス本体}

// 継承やインターフェイスの実装がある場合
// object: 基底クラスorインターフィエス {クラス本体}

fun main () {
    // Android開発でボタンを押したらXXしたいとき
    // btn.setOnClickListener(object: View.setOnClickListener {
    //     override fun onClick(view: View) {
    //         // ボタンが押された時の処理
    //     }
    // })
    //　ひとつしか抽象メソッドを持たないインターフェイス
    // SAM interface (Single Abstract Method)

    // よりシンプルにラムダ式で描くことができる。→SAM変換
    // btn.setOnClickListener({ view: View -> クリックしたときの処理 })

    // ラムダ式はさらに省略可能
    // - 引数の型が明らかな時、省略可能
    // - 引数を利用しないなら引数そのものを省略可能
    // - ラムダ式をくくる丸括弧は省略可能
    // btn.setOnClickListener{ クリックしたときの処理 }
    // 公式リファレンスではSAM変換で使われているのがほとんど
}