fun main() {
/**
セット：順序の概念がなく、要素の重複を許さない。数学でいう集合
 */

    val set: MutableSet<Int> = mutableSetOf(10, 20, 30)
    println(set)

    // 追加
    set.add(40)
    set.add(40) // ← これは追加されない
    println(set)

    // 削除　
    set.remove(30) // 順番の概念がないので、直接要素の値を指定する
    println(set)

}