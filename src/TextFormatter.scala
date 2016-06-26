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

}
