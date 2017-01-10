package example

object Futures {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Welcome to the Scala worksheet")

	import scala.concurrent.Future
	import scala.concurrent.ExecutionContext.Implicits.global;$skip(180); 
	
  val s: Future[Int] = Future {
  	Thread.sleep(100)
  	Console.println(10)
  	10
  };System.out.println("""s  : scala.concurrent.Future[Int] = """ + $show(s ));$skip(40); 
  
  
  val s1 = s.map(x => x.toString);System.out.println("""s1  : scala.concurrent.Future[String] = """ + $show(s1 ));$skip(42); val res$0 = 
  
  for (x <- s;
  			y <- s1) yield x+y;System.out.println("""res0: scala.concurrent.Future[String] = """ + $show(res$0));$skip(42); val res$1 = 
  
  
  s flatMap (x => s1.map(y => x+y));System.out.println("""res1: scala.concurrent.Future[String] = """ + $show(res$1));$skip(19); val res$2 = 
  
  s.isCompleted;System.out.println("""res2: Boolean = """ + $show(res$2))}
}
