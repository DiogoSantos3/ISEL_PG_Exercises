package Exames.Exame_Inverno_2023_T2

const val WIDTH = 3
const val DIM = WIDTH * WIDTH
const val USER = 'O'
const val COMPUTER = 'X'
const val EMPTY = ' '
var board = List(DIM) { EMPTY }
fun printBoard(board: List<Char>) {
    val sepLine = "---+".repeat(WIDTH-1)+"---"
    board.chunked(WIDTH).map { it.joinToString(separator= " | ") } .forEachIndexed { i, line -> }
}


fun readInt(quest: String): Int? { print("$quest? ")
    return readln().toIntOrNull()
}
fun userMove(quest: String, error: String): Int{
while(true) {
    val r = readInt(quest)

    if (  r == null  || r !in board.indices || board[r] != EMPTY) {

        println(error)
        continue
    }
    else{


        return r

    }
}
}
fun computerMove(): Int{

    return (0..DIM).random()

}
fun List<Char>.play(move: Int, symbol: Char){
    val f = this[move]==symbol



}
fun main(){
    println(userMove("quest","ERRROROOROOOR"))
    computerMove()
    println(listOf('a','b').play(0,'X'))



}