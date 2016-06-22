/**
  * Created by markk on 21/06/2016.
  */
object WarehouseUser {

  //view list of orders, view information of order
  def main(args: Array[String]) {

    doUI()
  }

  def printList(): Unit ={
    //print list of orders  CHANGE THIS TO CONTROL ITEMS?
    val list = new OrderList
    for (item <- list.orders) {
      println(item)
    }
  }

  def doUI(): Unit = {

    println("\n\n----------------------------\n")

    var run: Boolean = true
    do {
      println("\nEnter a command:\n1. View order list\n2. Quit\n")
      val i = scala.io.StdIn.readInt()
      i match {
        case 1 => printList()
        case 2 => /* println("Existing"); */ run = false
        case whoops => println("Unexpected choice, try again")
      }
    } while (run)

    println("Exiting...")
  }
}
