fun main() {
   // var foo: String = "foo"
   var foo: String? = "foo" // null許容する型→nullable型
   foo = null 

   // ?→セーフコール演算子

   var a: Int = 10000
   var b: Int = a
   var c: Int? = a // 暗黙的な型変換
   println(a == b) // true
   println(a === b) //true
   println(a == c) //true
   println(a === c) //false

    // == 同じ値かを確認（同値性）
    // === 同じオブジェクトであることを確認（同一性）
    // a: 非null型
    // c: 暗黙的にnullable型になっている（ボクシングという）

}