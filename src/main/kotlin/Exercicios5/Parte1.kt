package Exercicios5
//Dada uma lista list de inteiros, retorna uma nova lista com os o quadrado dos elementos de list
fun square(list:List<Int>) = list.map{it*it}

//Retorna uma nova lista com todas as palavras presentes em list com dimensão k
fun filterWordsWithLenghtK(list: List<String>,k:Int):List<String> = list.filter { it.length == k }
fun filterWordsWithLenghtKv2(list:List<String>,k:Int):List<String>{
    var newList = emptyList<String>()
    for (elem in list){
        if (elem.length == k){newList = newList +elem}
    }
    return newList
}

//Retorna uma única lista de todos os inteiros presentes nas várias listas contidas em list
fun flat(list: List<List<Int>>):List<Int> = list.flatMap { it }
fun flatv2(list: List<List<Int>>):List<Int>{

    var newlist = emptyList<Int>()
    for (element in list){
        for (element2 in element){
            newlist = newlist + element2
        }
    }
    return newlist
}

//Retorna uma nova lista com os elementos presentes em list que são iguais ao índice onde se encontram na lista list
fun sameElementAsIndex(list: List<Int>) = list.filter { it == list.indexOf(it) }
fun sameElementAsIndexv2(list: List<Int>):List<Int>{
    var newList = emptyList<Int>()
    for(elem in list){
        if (elem == list.indexOf(elem)){
            newList = newList + elem
        }
    }
    return newList
}

//Retorna o maior elemento presente na lista. Caso a lista seja vazia, deverá retornar null
fun greater(list: List<Int>): Int? {
    if (list.isEmpty()) {
        return null
    }
    var max = list[0]
    for (element in list) {
        if (element > max) {
            max = element
        }
    }
    return max
}

fun main(){
    val list1 = listOf(12,1,2,32,3,135)
    val list2 = listOf("Manuel","Diogo","Ana","Mário","Jorge")
    val list3 = listOf(41,12,31231,4124013,4,121)
    val listCombinada = listOf(list1,list3)

    println("Square -> ${square(list1)}")
    println("Filter Words with lenghtK -> ${filterWordsWithLenghtK(list2,5)}")
    println("Flat List -> ${flat(listCombinada)}")
    println("Same Element As Index -> ${ sameElementAsIndex(list1) }")
    println("Greater -> ${greater(list3)}")
    println("Test filter ->")
    println("Test map -> ${list1.filter {it%2==0}}")
}