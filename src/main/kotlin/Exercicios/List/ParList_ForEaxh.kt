package Exercicios.List

fun List<Int>.filterEven():List<Int>{
    var list = emptyList<Int>()
    for(elem in this){
        if (elem % 2 == 0){list=list+elem}
    }
    return list

}

//OU

fun List<Int>.filterEve():List<Int>{
    var list = emptyList<Int>()
    for(i in list.indices){
        if (this[i]%2==0){list=list+this[i]}
    }
    return list
}

fun main(){
    val list = listOf(1,10,3,7,6,8,11)
    //val new = list.filterEvens()
    //println(new)
}