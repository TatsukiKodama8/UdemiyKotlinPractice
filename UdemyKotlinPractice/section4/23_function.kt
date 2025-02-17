// KotlinではJavaとはことない、クラス内だけではなくトップレベルでも宣言できる→Java利用者にとってはふつうではなかったのか！？
fun getTriangleArea (width: Double, height: Double): Double {
    return width * height / 2
}

fun main(){

    // 関数の中にも定義できる→ローカル関数
    fun sayHello (name: String): Unit { // UnitはCで言うvoidと同じ
        println("Hello ${name}.")
    }

    fun getCircleArea (radius: Double): Double = radius * radius * 3.14159265

    println(getTriangleArea(10.0, 11.1))
    sayHello("Masao")
    println(getCircleArea(2.0))
}
