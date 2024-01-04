package Exames.Exame_Verao_2023_T1

const val GRID_SIZE = 32
data class Point(val x: Int, val y: Int)
data class Frog(val position: Point)

fun Frog.toCenter():Point = Point(position.x + GRID_SIZE / 2, position.y + GRID_SIZE / 2)

