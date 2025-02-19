import model.*

fun main() {
    // enum型　(enumerate)
    val day: Week = Week.Sunday
    println(day)

    if (day == Week.Sunday) {
        println(true)
    }

    when(day) {
        Week.Sunday -> println(true)
        else -> {
            println("otherwise")
        }
    }

    val dayJapan: Week = Week.Tuesday
    println(dayJapan.value)
    println(dayJapan.ordinal) // 上から連番のid

    for (week in Week.values()) {
        println("$week = ${week.value}")
    }

}