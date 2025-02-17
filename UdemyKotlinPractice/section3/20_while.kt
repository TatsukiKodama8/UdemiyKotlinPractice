fun main() {

    println("while")
    var i = 1
    while (i < 2) {
        println(i)
        i ++
    }

    println("do-while")
    var j = 2
    do {
        println(j)
        j ++
    } while (j < 2)

    // do whileループはパスワードの入力などに使える
    // つまり
    // 利用者にとりあえず一回パスワード入力させる
    // whileの中の条件分で判定する。
    // パスワードが間違っている間回し続ける→isInvalid == true
}