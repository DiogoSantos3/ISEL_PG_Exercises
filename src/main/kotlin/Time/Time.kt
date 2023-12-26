package Time

data class Time(val hours: Int, val minutes: Int, val seconds: Int) {
    init {
        //Não é preciso este init
        require(hours >= 0) { "Horas não podem ser negativas" }
        require(minutes in 0..59) { "Minutos devem estar entre 0 e 59" }
        require(seconds in 0..59) { "Segundos devem estar entre 0 e 59" }
    }
}
fun Time.printT(msg : String): String {
    return "${msg} = ${hours}:${minutes}:${seconds}"
}
fun Time.tooInt(): Int {
    //Está diferente do enunciado
    return hours * 3600 + minutes * 60 + seconds
}
fun Time.minus(other: Time) : Time {
    val secondsTime1 = this.tooInt()
    println("segundo1: ${secondsTime1}")
    val secondsTime2 = other.tooInt()
    println("segundo2: ${secondsTime2}")
    val differenceSeconds = secondsTime1 - secondsTime2
    println("diff: ${differenceSeconds}")

    val horas = differenceSeconds/ 3600
    println("horas: ${horas}")
    println("min${(differenceSeconds%3600)/60}")
    println("sec ${((differenceSeconds%60)) }")
    return Time(differenceSeconds/3600,(differenceSeconds%3600)/60,differenceSeconds % 60)
}
fun main(){
    val time1 = Time(4,45,2)
    val time2 = Time(1,50,1)
    val printTime = time1.printT("Chegada")
    val timeInt = time1.tooInt()
    val diff  = time1.minus(time2)
    println("Difference between ${time1} and ${time2} is ${diff}")
    println(printTime)
    println("Time in seconds: ${timeInt}")

}