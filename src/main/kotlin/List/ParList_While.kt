package List


fun countLeuers(str:String):Int{ var count=0
    var i=0

    while(i<str.length){
        if( str[i].isLetter() ) count++
        i++ }
    return count }
fun main() {
    println("Introduza uma string")
    println(countLeuers("line")) }
