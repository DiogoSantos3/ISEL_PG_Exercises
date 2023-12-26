fun readOneLine(n: Int): String? {
    println("Linha $n?")
    val r = readln()
    if (r.length != 0){return r.replace(" ", "")}
    else{return null}
}


fun readLines(max: Int): List<String>{
    var count = 0
    val list = mutableListOf<String>()

    do{
        val read = readOneLine(count + 1 )
        if (read != null){
            count++
            list.add(read)
        }

    }while(count != max )

    return list
}

fun lengthAverageOf(lines: List<String>):Double {

    val newList = mutableListOf<Int>()
    lines.map{newList.add(it.length)}

    return newList.average()

}



fun String.numberOfWords(): Int {
    if (this.isEmpty()) {
        return 0
    }
    val words = this.trimEnd().trimStart().split(" ")

    println(words)
    return words.count { it.isNotEmpty() }
}
fun List<String>.printIf(condition: (String)->Boolean){
    this.map{

    }

}

fun main(){

    println("    gosto  muito de pg     " .numberOfWords())
}