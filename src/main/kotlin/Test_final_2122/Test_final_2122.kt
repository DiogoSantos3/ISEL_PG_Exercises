fun readWords(): List<String> =
    readln().split(' ').filter { it.all{ it.isLetter() } }.map { it.uppercase() }

fun countLetter(word:String, letter:Char):Int{
    var count = 0
    for (char in word){
        if(char == letter){count++}
    }
    return count
}

fun String.toSlots():List<Char>{
    return this.map{i-> '_'}
}

fun readLetter(quest:String):Char?{
    print("$quest?")
    val pergunta  = readln()
    if (pergunta.length == 1 && pergunta[0].isLetter()){
        return null
    }
    return pergunta[0].uppercaseChar()
}

fun List<Char>.replaceWhereLetterOccurs(word:String, letter:Char):List<Char>{
    val list = this

    return this.mapIndexed{index, elem -> if(word[index] == letter)letter else elem}

}


fun main(){

    println(countLetter("CAVALO",'A'))
    println("CAVALO".toSlots())
    //readLetter("letra")
    println(listOf('_','_','V','_','_','_').replaceWhereLetterOccurs("CAVALO",'A'))

}
 

 


 

 