fun main() {
    /**
    コレクション：複数の値（要素をまとめて扱う）
    可変長（配列は固定長）
    リスト：順番の概念を持つ
     */
    
    // 通常、リストは読み取り専用。→mutableを付加
    val list: MutableList<Int> = mutableListOf(10, 20, 30)

    list[0] = 100
    println(list[0])

    println(list)

    // 追加
    list.add(200)
    println(list)

    list.add(0, 500) // 0番目に追加
    println(list)

    // 削除
    list.removeAt(0)
    println(list)

    list.remove(100) // 要素の値で100のものが削除される
    println(list)

}