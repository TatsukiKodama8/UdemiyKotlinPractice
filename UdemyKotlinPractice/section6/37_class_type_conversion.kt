// 型の変換→クラスからクラスへの変換

open class Person {}
class BusinessPerson: Person() {
    fun work() = println("Working")
}

// up cast
// 派生クラス→基底クラスのキャスト

// down cast
// 基底クラス→派生クラス
// 注意：一般にサブクラスのほうが基底クラスより機能が多い
fun main() {
    val p: Person = BusinessPerson() // up cast
    if (p is BusinessPerson) { // down castする際には型チェック
        p.work() // smart cast（is演算子でチェックしたら、そのスコープの中では自動的に型変換が行われている）
    }
}
