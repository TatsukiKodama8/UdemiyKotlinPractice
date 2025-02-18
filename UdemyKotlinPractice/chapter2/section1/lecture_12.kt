fun main() {
    /**
    マップ：キーと要素をセットで管理する
     */

    // キーと要素がString
    val map: MutableMap<String, String> = mutableMapOf<String, String>(
        "orange" to "オレンジ", 
        "melon" to "メロン", 
        "apple" to "アップル"
        )
    
    // 変更
    map["apple"] = "りんご"
    println(map)

    // 追加
    map["banana"] = "バナナ"
    println(map)

    // 削除
    map.remove("apple")
    print(map)
}