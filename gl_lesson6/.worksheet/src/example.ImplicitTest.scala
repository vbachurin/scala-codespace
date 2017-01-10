package example

object ImplicitTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
  println("Welcome to the Scala worksheet")

  class IntWrapper(val x: Int) {
    def **(y: Int) = x * y * y
  };$skip(137); 

  implicit def x2wrapper(x: Int): IntWrapper = new IntWrapper(x);System.out.println("""x2wrapper: (x: Int)example.ImplicitTest.IntWrapper""");$skip(30); 

  def f(x: Int): Int = x**3;System.out.println("""f: (x: Int)Int""");$skip(9); val res$0 = 

  f(4);System.out.println("""res0: Int = """ + $show(res$0));$skip(40); 
  
  
  implicit val xImplicit: Int = 4;System.out.println("""xImplicit  : Int = """ + $show(xImplicit ));$skip(46); 
  
  def f2(x:Int)(implicit y:Int):Int = x**y;System.out.println("""f2: (x: Int)(implicit y: Int)Int""");$skip(11); val res$1 = 
  
  f2(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(11); val res$2 = 
  f2(4)(3);System.out.println("""res2: Int = """ + $show(res$2))}
}
