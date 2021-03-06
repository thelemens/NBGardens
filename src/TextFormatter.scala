import scala.collection.mutable.ArrayBuffer

/**
  * Created by markk on 26/06/2016.
  */
object TextFormatter {

  def printOrderInfo(order: Order) = {

    println("Order Number: " + order.oid + "\nCustomer: " + order.cid + "\nOrdered with: " +
      order.eid + "\nOrder status: " + order.status + "\nDate Ordered: " + order.datePlaced + "\nDate Shipped: " + order.dateShipped)

  }

  def printOrderItems(order: Order) = {

    println(order.orderLine + "\n")
  }

  def printOrderList(orders: Orders, itr: Int):Unit = {
    if (itr == 0) {
      println("----------------\nList of Orders")
    }
    if (!orders.isEmpty) {
      println(itr + 1 + ".  Order " + orders.head.oid)
      printOrderList(orders.tail, itr + 1)
    }
  }

  def printList(list: Orders): Unit ={
    //print list of orders  CHANGE THIS TO CONTROL ITEMS?
    var i: Int = 0
    for (item <- list) {
      i += 1
      println(i + ". " + item)
    }
  }

}
