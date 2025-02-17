fun main() {
    // 型サフィックス（suffix→接尾語）
    var a = 10L // Long型の整数として型推論される
    var b = 10F // Float型として定義される

    println(a)
    println(b)
    println(a::class) // ::classで変数の型を出力すると述べている
    println(b::class)

    // suffixは大文字・小文字を区別しない
    // しかし小文字の「l」は数字の「１」と間違えやすいので禁止
}