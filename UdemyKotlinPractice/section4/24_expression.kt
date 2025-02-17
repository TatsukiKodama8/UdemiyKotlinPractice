fun main(){
    fun getTriangleArea (width: Double=1.0, height: Double=1.5): Double {
        return width * height / 2
    }  
    println(getTriangleArea()) //  0.75
    println(getTriangleArea(3.0)) // 2.25

    // 名前つき引数
    //→順番による制限がない！！
    println(getTriangleArea(height=3.0, width=2.0)) // 3.0
    println(getTriangleArea(height = 3.0))
    println(getTriangleArea(3.0, height = 2.0))
    println(getTriangleArea(width = 3.0, 1.0)) // エラーのはずだんだが、エラーにならない

    fun getSquareArea(width: Double, height: Double=1.0): Double {
        return width * height
    }
    // println(getSquareArea(2.0)) // エラー

    // 基本的にデフォルト値は最後のほうに書く方針をとることで、安全に関数を扱うことができる

}
