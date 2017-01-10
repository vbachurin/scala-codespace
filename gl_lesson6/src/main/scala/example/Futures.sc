package example

object Futures {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	import scala.concurrent.Future
	import scala.concurrent.ExecutionContext.Implicits.global
	
  val s: Future[Int] = Future {
  	Thread.sleep(100)
  	Console.println(10)
  	10
  }                                               //> s  : scala.concurrent.Future[Int] = List()
  
  
  val s1 = s.map(x => x.toString)                 //> s1  : scala.concurrent.Future[String] = List()
  
  for (x <- s;
  			y <- s1) yield x+y        //> res0: scala.concurrent.Future[String] = List()
  
  
  s flatMap (x => s1.map(y => x+y))               //> res1: scala.concurrent.Future[String] = List()
  
  s.isCompleted                                   //> res2: Boolean = false
}