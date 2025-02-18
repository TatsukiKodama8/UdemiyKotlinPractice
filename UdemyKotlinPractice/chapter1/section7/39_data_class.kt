// dataだけを保持するクラス
// 処理は持たない

// クラスの宣言であるにももかかわらず、中身を持たない！！
// primary constructorで変数を宣言！
// data class Member(val name: String, val age: Int)

// - primary constructorが1つ以上の引数を持つ
// - constructorの引数はすべてval/varを付与
// - abstract / open / sealed / innerの修飾子は使用不可

// data class Member(val name: String = "") {
//     var age: Int = 0
// }

fun main() {
    // === equals method (==) ===
    // primary constructorで定義されたプロパティが等しいかどうかを確認する。
    // ageはprimary constructorで定義されていないことに注意。ageが異なってもtrueを返す
    // val m1 = Member("佐藤")
    // m1.age = 30
    // val m2 = Member("佐藤")
    // m2.age = 22
    // println(m1 == m2) // true

    // === toString method ===
    // println関数を呼び出された時にも暗黙のうちに呼び出される
    // ageは呼び出されていないことに注意
    // primary constructorで定義されているプロパティのみ出力
    //println(m1) // Member(name=佐藤)

    // === componentN (分割代入) === 
    //val t = Triple("海崎", "フリーター", 27)
    //val (name, job, age) = t

    // 内部的には
    // val t = Triple("海崎", "フリーター", 27)
    // val name = t.component1()
    // val job = t.component2()
    // val age = t.component3()
    
    // 分割代入はcomponentNのsyntax sugar（簡単な書き方）
    // 分割代入ができるからといって使うべきか。
    data class Member(val name: String, val job: String, val age: Int)
    val m = Member("海崎", "フリーター", 27)
    val (name, job, age) = m
    println("name: ${name}, jog: ${job}, age: ${age}")

    // === copy ===
    val m1 = Member("海崎", "フリーター", 27)
    val m2 = m1.copy(age = 28)
    println("m1: ${m1} \nm2: ${m2}")
}