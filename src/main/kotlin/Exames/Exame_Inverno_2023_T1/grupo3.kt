package Exames.Exame_Inverno_2023_T1

fun xpto(sortedList:List<Int>,x:Int):List<Int>{
    if (sortedList.isEmpty()) return emptyList()
    val y = sortedList.first() + sortedList.last()
    return when {
        y == x -> listOf(sortedList.first(), sortedList.last())
        y > x -> xpto(sortedList.dropLast(1), x)
    else -> xpto(sortedList.drop(1), x)
} }
fun main(){
    xpto(listOf(1,3,4,5,6,10),10)
    //O RETORNO É {4,6}
    //SÃO FEITAS 4 CHAMADAS E SÃO CRIADAS 5 LISTAS, UMA NO MAIN E 4 NA FUNÇÃO

}