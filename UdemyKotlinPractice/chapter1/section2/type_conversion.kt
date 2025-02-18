fun main() {
   // ワイドニング
   // 値範囲の狭い範囲から広い型
   // 例）float→double
   
// エラー
//    var a: Float = 1.2
//    var b: Double = 10

    var a: Float = 1.2f
    var b: Double = 10.0
    println(a::class)
    println(b::class)

    // Kotlinでは明示的に肩を変換する
    var c = 10
    var d: Long = a.toLong()
    println(c::class)
    println(d::class)
}