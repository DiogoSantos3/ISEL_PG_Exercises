package Exames.Exame_Inverno_2023_T1/*
data class Position(val col: Int, val line: Int)
enum class Direction(val dCol: Int, val dLine: Int) {
    UP(0,-1), RIGHT(+1,0), DOWN(0,+1), LEFT(-1,0) }



operator fun Position.plus(dir: Direction):Position{
    val somC = this.col + dir.dCol
    val somL = this.line + dir.dLine
    return Position(somC,somL)
}

fun Game.cantPushBox(pos:Position,dir:Direction):Boolean{

    val newPos = pos.plus(dir)
    return newPos in walls || newPos in boxes

}

fun Direction.reverse():Direction = when(this)

{
    Direction.LEFT -> Direction.RIGHT
    Direction.RIGHT -> Direction.LEFT
    Direction.UP -> Direction.DOWN
    else-> Direction.UP

}


fun Game.undoMoveMan():Game{

    val lastMove =

}*/