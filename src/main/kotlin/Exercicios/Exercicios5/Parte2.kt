package Exercicios.Exercicios5

//Retorna o número de dígitos do número. Exemplo, se number for 1232, deverá retornar 4
fun countDigits(num:Int):Int {
    val num = num.toString()
    return num.length
}

//Retorna a soma dos dígitos do número. Exemplo, se number for 1232, deverá retornar 8
//NÃO ESTÁ ACABADO
fun sumDigits(num:Int):Int{
    val num = num.toString()
    for (digits in num){
    println(digits)
    }
    return 4
}

fun main(){

    println("Count Digits -> ${countDigits(12345)}")

}