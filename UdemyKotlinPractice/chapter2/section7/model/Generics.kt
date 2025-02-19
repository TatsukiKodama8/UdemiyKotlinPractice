package model

class Generics<T: Character>(var value: T) {
    fun display() {
        value.showStatus()
    }
}