package example

object TypeclassExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); 
  println("Welcome to the Scala worksheet")

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
  };$skip(385); val res$0 = 
  
  Out.sendJson(Point(1,2));System.out.println("""res0: String = """ + $show(res$0))}
}
