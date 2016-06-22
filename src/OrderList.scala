/**
  * Created by markk on 21/06/2016.
  */
class OrderList(){

  val orders: List[String] = List("Order 1", "Order 2", "Order 3")

  //PLACEHOLDER: Use Order as return type not string
  def getOrderAtIndex(ind: Int): String = {
    println(orders(ind-1) + " plus information")
    "worked"
  }
}
