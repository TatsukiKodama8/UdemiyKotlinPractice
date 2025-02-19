import model.*

fun main() {

    var status = StatusTest.Enable
    status = StatusTest.Disable
    status = StatusTest.Error

    var s: Status = Status.Enable
    s = Status.Disable
    s = Status.Error("Error: 001")

}
