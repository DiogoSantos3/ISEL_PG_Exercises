package Exames.Exame_Verao_2023_T2
data class Product(
    val name: String,
    val price: Int //Cêntimos
)

val forSale = listOf( Product("Caneta", 150), Product("Borracha", 75), Product("Caderno", 230), Product("Mochila", 3520))
data class Item(
    val quantity: Int,
    val product: Product
)
fun getProduct(name:String):Product?{

    for (i in forSale){
      if(i.name == name){return i}}
    return null

}
 fun Item.priceInEuros():Float{
     val totalPriceInCents = this.quantity * this.product.price
     return totalPriceInCents.toFloat() / 100

}
fun main(){

    getProduct("Caneta")
}