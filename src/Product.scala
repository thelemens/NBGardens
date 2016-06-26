/**
  * Created by markk on 21/06/2016.
  */
import Location._
import StatusEnum._

case class Product(pid: Int, name : String, productType : String, stock : Int, price : Double, location : Location, status : String, desc: String) {

  def updateStock(amount: Int){
    stock += amount
  }
}
