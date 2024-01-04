package Exames.Exame_Inverno_2023_T1

fun readInte(quest: String): Int? {
    print("$quest? ")
    return readln().toIntOrNull()
}


fun readWordIndices(quest: String): List<Int>{
    var order = 1
    val listIndex = mutableListOf<Int>()

    while(true){
        val index = readInte("$order . $quest ")
        if (index != null){
            if(index in (0..15)){
                listIndex.add(index)
                order++
            }
            else(println("Índice inválido. Por favor, introduza um valor no intervalo de 0 a 15."))

        }
        else{break}
    }
    return listIndex
}

fun List<Int>.isValidIndices(): Boolean{
    val neighborIndices = listOf(
        listOf(1,4,5), listOf(0,2,4,5,6), listOf(1,3,5,6,7), listOf(2,6,7), listOf(0,1,5,8,9), listOf(12,3,1,2))


    for (i in 0 until this.size -1) {

        if (this[i] +1  !in neighborIndices[this[i]]) {
            return false
        }
    }
    return true
}


fun readValidPlay(quest: String, errorMessage: String): List<Int> {
    while (true){
        val indices = readWordIndices(quest)
        if (indices.isValidIndices()) {
            return indices
        }
        else {
            println(errorMessage)
        }
    } }
val dictionary = listOf("LEAN", "PEEL", "CLEAN", "PACE", "LENT", "BENT", "PENT",
    "CLAN", "THANE", "BLEEP", "ELAN", "CELEB", "CAPE", "CAPELAN", "CAPO")
fun getWord(indices: List<Int>, board: List<Char>): String?{

var palavra = ""
    for(i in indices){
        palavra=palavra+board[i]
    }
    return if(palavra in dictionary)palavra else null

}

fun main() {


    println(readValidPlay("QUEST","ERRORRRR"))
}
