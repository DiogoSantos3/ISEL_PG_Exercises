package Exames.Exame_Verao_2023_T1

fun readlnOfWords(): List<String> = readln().split(' ').filter { it.length>0 }

fun readlnWords():List<String>?{

    val r = readlnOfWords()
    if(r == emptyList<String>())
        return null
    else{return r}
}



fun lengthAverageOf(words: List<String>):Double{

    val listInt = words.map{it.length}
    return listInt.average()
}

fun readLinesWords(maxLines: Int): List<String>{

    var count = 0
    val list = mutableListOf<String>()

    while(count != maxLines){

        val r = readlnWords()
        if(r == null){
            break}
        count++
        list.addAll(r)

    }


    return list
}


fun List<String>.toCountersByLength(from: Int, to: Int): List<Int> {

    val counters = mutableListOf<Int>()
    for (i in from..to) {
        counters.add(this.count { it.length == i })
    }
    return counters
}


fun main(){
    println("Introduza até 5 linhas com palavras.")
    val r = readLinesWords(5)
    var count=0
    for (i in r ){
        count++
    }
    println("Foram lidas $count palavras")
    println("A média do comprimento das palavras é ${lengthAverageOf(r)}")
    val length= lengthAverageOf(r).toInt()
    println("Histograma do comprimento das palavras entre ${length-2} e ${length + 2}:")


    //-------------------
    for(i in (length-2) .. (length+2)){
        println("comprimento $i = ${r.toCountersByLength((lengthAverageOf(r) - 2).toInt(),(lengthAverageOf(r) +2).toInt())} palavras")

    }


}