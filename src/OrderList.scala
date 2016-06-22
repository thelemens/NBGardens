/**
  * Created by markk on 21/06/2016.
  */
class OrderList{

  val orders: List[String] = List("Order 1", "Order 2", "Order 3")

  case class Order(oid: Int, list: Product)
  val change = ""

}
