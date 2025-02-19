import model.*

fun main() {
    // インスタンスを作成
    val outer = Outer(10)
    outer.display() // outer classのdisplay method
    println()

    outer.innerCreate(20)
    outer.obj.display()
    println()

    val innerObj: Outer.Inner = outer.innerCreateReturn(30)
    innerObj.display()

}