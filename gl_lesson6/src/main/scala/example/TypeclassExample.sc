package example

object TypeclassExample {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  case class Point(x: Int, y: Int)
  
  trait JsonPrinter[T] {
    def print(t: T): String
  }
  
  implicit object PointJsonPrinter extends JsonPrinter[Point] {
  	def print(t: Point): String = {
  		import t._
  		s"Coordinates: $x,$y"
  	}
  
  }
  object Out {
    def sendJson[T](x: T)(implicit jsp: JsonPrinter[T]) = {
      jsp.print(x)
    }
  }
  
  Out.sendJson(Point(1,2))                        //> res0: String = Coordinates: 1,2
}