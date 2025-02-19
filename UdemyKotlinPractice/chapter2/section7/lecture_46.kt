import model.*

fun main() {
    val p: Generics<Player> 
        = Generics(Player("player", 100, 10, 10))
    p.display()
    
}