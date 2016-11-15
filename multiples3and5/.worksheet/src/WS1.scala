object WS1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(267); 
/*
  var i = 0
  var s = 0
  while(i < 10) {
  	val div3 = if (i % 3 == 0) true else false
  	val div5 = if (i % 5 == 0) true else false
  	if (div3 || div5) {
  		s += i
  	}
  	i += 1
  }
  s
*/
  
  
  val f: Int => Boolean = ((x:Int) => (x % 3 == 0));System.out.println("""f  : Int => Boolean = """ + $show(f ));$skip(34); 
  
  def f1(x: Int) = (x %3 == 0);System.out.println("""f1: (x: Int)Boolean""");$skip(34); 
  val myFun00 = (x: Int) => f1(x);System.out.println("""myFun00  : Int => Boolean = """ + $show(myFun00 ));$skip(35); 
  val myFun: (Int => Boolean) = f1;System.out.println("""myFun  : Int => Boolean = """ + $show(myFun ));$skip(51); 
  
  val r0 = (1 to 10).filter(x => (x % 3 == 0));System.out.println("""r0  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(r0 ));$skip(78); 
 
  val r = 1 until 1000 filter(x =>
  	(x % 3 == 0) || (x % 5 == 0)
  	) sum;System.out.println("""r  : Int = """ + $show(r ))}
}
