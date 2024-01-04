package Exames.Exame_Verao_2122_T2

fun fx(s: String, chars: List<Char>): List<Char> { if (s.isEmpty()) return emptyList()
    print("-${s.first()}")
    val c = fx(s.drop(1), chars)
    print(c)
    return if (s[0] in chars) c + s[0] else c
}

fun main(){
    fx("ensino", listOf('a', 'e', 'i', 'o', 'u'))
}