package Difference
data class Nums (val num1:Int, val num2:Int,val num3:Int)


fun diff(num1:Int,num2:Int):Int{

    return if (num1 > num2){
         num1 - num2
    }
    else{
         num2-num1
    }

}

fun bigDiff(a: Int, b: Int, c: Int): Int {
    val diffAB = diff(a, b)
    val diffAC = diff(a, c)
    val diffBC = diff(b, c)
    val bigdiff : Int
    if (diffAB > diffAC){
        if (diffAB > diffBC){
            bigdiff = diffAB
        }
        else{
            bigdiff=diffBC
        }
    }

    else if(diffAC > diffBC) {

            if (diffBC>diffAB){
                bigdiff = diffBC
            }
            else{
                bigdiff=diffAB
            }

    }
    else{
        bigdiff = diffBC
    }



    return bigdiff

}

fun main(){
    print("Digite o 1º número: ")
    val num1 = readln()
    print("Digite o 2º número: ")
    val num2 = readln()
    print("Digite o 3º número: ")
    val num3 = readln()
    println("A diferença entre os dois primeiros números é: ${diff(num1.toInt(),num2.toInt())}")
    print("A maior diferença dos números introduzidos é: ${bigDiff(num1.toInt(),num2.toInt(),num3.toInt())}")



}