/**
  * Created by markk on 21/06/2016.
  */
object WarehouseUser {

  //view list of orders, view information of order
  def main(args: Array[String]) {

    doUI(genOrderList())
  }

  def genOrderList(): OrderList = {
    new OrderList()
  }

  def printList(list: OrderList): Unit ={
    //print list of orders  CHANGE THIS TO CONTROL ITEMS?
    var i: Int = 0
    for (item <- list.orders) {
      i += 1
      println(i + ". " + item)
    }
  }

  def doUI(list: OrderList): Unit = {

    println("\n\n----------------------------\n")

    var run: Boolean = true
    do {
      println("\nEnter a command:\n1. View order list\n2. Quit\n")
      val i = scala.io.StdIn.readInt()
      i match {
        case 1 => printList(list); doOrderUI(list)
        case 2 => /* println("Existing"); */ run = false
        case whoops => println("Unexpected choice, try again")
      }
    } while (run)

    println("Exiting...")
  }

  def doOrderUI(list: OrderList): Unit = {

    println("-----------\n\nChoose the number of an order, or [0] to exit")
    var run: Boolean = true

    do {

      val c = scala.io.StdIn.readInt()
      list.getOrderAtIndex(c)


      run = false
    } while(run)
  }
}
