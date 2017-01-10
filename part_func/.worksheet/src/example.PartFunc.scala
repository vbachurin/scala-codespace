package example

object PartFunc {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  println("Welcome to the Scala worksheet");$skip(81); 


  val func: PartialFunction[Int, Int] = {
    case x: Int if (x < 9) => 1

  };System.out.println("""func  : PartialFunction[Int,Int] = """ + $show(func ));$skip(16); val res$0 = 
  
  
  func(8);System.out.println("""res0: Int = """ + $show(res$0));$skip(11); val res$1 = 
  func(10);System.out.println("""res1: Int = """ + $show(res$1))}
}
