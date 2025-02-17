// val a = 10 
// a = 11
// println(a) →エラー
fun main(){
    val a = arrayOf(1, 2, 3)
    //a = arrayOf(4, 5, 6) // エラー
    a[2] = 4 // OK
    // 再代入が禁止されている
    println(a[2])

    // 再代入する予定のないものは、valを利用
}