import model.*

fun main() {
    val f1 = Fruits("りんご", 100)
    val f2 = Fruits("りんご", 100)

    f1.area = "青森"
    f2.area = "長崎"

    println(f1)

    println(f1 == f2)

    val f3: Fruits = f1.copy(price = 200)
    println(f3)

    val (name, price) = f1
    println(name)
    println(price)
}