data class Bet(val key: List<Int>, val stars: List<Int>) // Apostas ou Chaves

fun Bet.show(name: String) = println("$name: $key + $stars")

data class Prize(val num: Int, val equalsKeys: Int, val equalsStars: Int) // Prémios

val prizes = listOf( Prize(1,5,2), Prize(2,5,1), Prize(3,5,0), Prize(4,4,2), Prize(5,4,1),
    Prize(6,3,2), Prize(7,4,0), Prize(8,2,2), Prize(9,3,1), Prize(10,3,0),
    Prize(11,1,2), Prize(12,2,1), Prize(13,2,0) )

fun numberOfEquals(first: List<Int>, second: List<Int>): Int = first.count { it in second }


fun readInt(q: String): Int? { print("$q? ")
    return readln().toIntOrNull()
}

//1
fun readValidNumber(quest: String, max: Int, exclude: List<Int>): Int {
    var input : Int?

    do{
        input = readInt("$quest, (1...$max)")

    }while(input == null || input > max || input < 1 || input in exclude)

    return input

}


//2
fun readValidNumbers(name: String, size: Int, max: Int): List<Int> {

    var count :Int = 0
    var list = emptyList<Int>()
    do{
        val numb = readValidNumber(name,max,listOf(27,18))
        if (numb !in list) {
            count++
            list = list + numb
        }
        else{println("número repetido")}

    }while(count != size)


    return list.sorted()
}


//3
fun generateRandomNumbers(size: Int, max: Int): List<Int> {

    var count :Int = 0
    val list = mutableListOf<Int>()
    do{
        val randomN = (1..max).random()
        count++
        list.add(randomN)


    }while(count != size)

    return list
}

//4
fun getBet(random: Boolean): Bet{

    if (random){
        val key = generateRandomNumbers(5,50)
        val stars = generateRandomNumbers(2,12)
        return Bet(key,stars)}

    else{
        val key = readValidNumbers("Key",5,50)
        val stars = readValidNumbers("Stars",2,12)
        return Bet(key,stars)}
}

//5

fun Bet.getPrize(winning: Bet): Prize?{
    val keys = numberOfEquals (this.key,winning.key)
    val certo = numberOfEquals(this.stars, winning.stars)
    return prizes.firstOrNull {
        it.equalsKeys==keys && it.equalsStars==certo }

}

//main
fun main() {
    val num = readln()
    var cont = 0
    val list = mutableListOf<Bet>()
    getBet(true).show("Chave Vencedora")
    do{
        cont++
        println("Aposta Aleatória (S/N)?")
        val resposta = readln()

        when(resposta){
            "S"->{val ap1 = getBet(true)
                list.add(ap1)}
            else->{val ap2 = getBet(false)
                list.add(ap2)}

        }}while(cont != num.toInt())


        /*
        val winningKey: Bet = getBet(random = true)
    winningKey.show("Chave vencedora")
    val numBets = readValidNumber("Número de apostas", 5 ,exclude = emptyList())
    val bets = List(numBets) {
    print("Aposta ${it+1} é aleatória (S/N) ? ")
    getBet(random = readln()[0] in "SsYy")
    }
    repeat(numBets) {
    bets[it].show("Aposta ${it+1}")
        val prize = bets[it].getPrize(winningKey)
       println(" - ${prize?.toString() ?: "Sem prémio"}")
}*/
}


