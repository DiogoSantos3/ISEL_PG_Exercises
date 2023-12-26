data class Cell(val col: Int, val line: Int)

enum class Dir(val dCol: Int, val dLine: Int) {LEFT(-1,0), RIGHT(+1,0), UP(0,-1), DOWN(0,+1) }


data class Ghost(val cell: Cell, val dir: Dir, val runAway: Int)


fun List<Ghost>.addGhost(startCell: Cell, startDir: Dir): List<Ghost> = this + Ghost(startCell, startDir, 0)

fun List<Ghost>.decRunAway()= map {
/*this.map {
    while (it.runAway > 0 ){
        println(this)
        it.copy(runAway = it.runAway -1 )
    }

}*/

    if (it.runAway>0) it.copy(runAway = it.runAway-1) else it
}


fun Dir.reverse(){
    when(this){
        Dir.LEFT -> Dir.RIGHT
        Dir.RIGHT -> Dir.LEFT
        Dir.UP -> Dir.DOWN
        else -> Dir.UP


    }}

operator fun Cell.plus(dir: Dir):Cell = Cell(this.col + dir.dCol, this.line + dir.dLine)