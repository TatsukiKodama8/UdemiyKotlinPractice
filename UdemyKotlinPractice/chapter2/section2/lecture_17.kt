fun main() {
    for(i: Int in 10 downTo 0 step 2) {
        println("i = $i")
    }

    for(i in 1..9) {
        for(j in  1..9){
            print("%3d".format(i*j))
        }
        println()
    }

}