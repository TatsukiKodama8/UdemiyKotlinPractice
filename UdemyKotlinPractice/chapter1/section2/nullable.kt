fun main() {
   var a: String? = "foo"
   println(a?.length)

   var b: String? = null
   println(b?.length) // null 

   print(b?.length ?: 0) // 三項演算子ではない！！ ?:とする。空白入れない

   println(a!!.length) // Nullable型を非null型に変換する
}