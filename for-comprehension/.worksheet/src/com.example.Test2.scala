package com.example

object Test2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  println("Welcome to the Scala worksheet")

  case class MySome[A](val value: A) extends MayBe[A]
  case object MyNone extends MayBe[Nothing]
  /*
  trait MonadicWorld[M] {
  	type M[A]
  	def foreach(M[A] => Unit): Unit = ???
  }
  */
  
  sealed trait Reason
  case object NotFound
  case class Error(message: String)

  sealed trait MayBe[+A] {
    def foreach(f: A => Unit): Unit =
      this match {
        case MySome(a) => f(a)
        case MyNone =>
      }
      
  	def map[B](f: A => B):MayBe[B] =
  		this match {
  			case MySome(a) => MySome(f(a))
	  		case MyNone => MyNone
  		}
      
	  def flatMap[B](f: A => MayBe[B]):MayBe[B] =
	  	this match {
	  		case MySome(a) => f(a)
	  		case MyNone => MyNone
	  	}
	  	
  	def flatten[A](mma: MayBe) =
  		this match {
  			case MySome(a) => a
  			case MyNone => throw new NoSuchElementException()
  		}
  // flatmap = map + flatten
  // flatmap = compose(map, flatten)
  
  	def filter(p: A => Boolean): MayBe[A] =
  		this match {
  			case MySome(a) => if (p(a)) this else MyNone
	  		case MyNone => MyNone
  		}
  	//def isEmpty:Boolean
  	
  	//def get(): A
  		
  };$skip(1130); 
  

  val mb: MayBe[Int] = MySome(4);System.out.println("""mb  : com.example.Test2.MayBe[Int] = """ + $show(mb ));$skip(42); 

  for (x <- mb) {
    Console.println(x)
  }
  
  sealed trait MyEither[+A,+B]

	case class MyLeft[A](a:A) extends MyEither[A,Nothing]
	
	case class MyRight[B](a:B) extends MyEither[Nothing, B];$skip(325); 
	
	/*
	sealed trait Try[A]
	class Success[A](value:A) extends Try[A]
	class Failure(ex: Throwable) extends Try[Nothing]
	*/
	
	val x = Try(throw new Throwable("Be-be-be"))
	
	
  
  object DB {
  	def findPerson(lastName: String): MayBe[String] = ???
  	def findMainEmail(person:String): MayBe[String] = ???
  }
  
  object DB2 {
  	def findPerson(lastName: String): Either[Reason, String] = ???
  	def findMainEmail(person:String): Either[Reason, String] = ???
  };System.out.println("""x  : <error> = """ + $show(x ));$skip(327); 
  
  val lastName: String = "AAA";System.out.println("""lastName  : String = """ + $show(lastName ));$skip(129); val res$0 = 
  for (person <- DB.findPerson(lastName);
  			email <- DB.findMainEmail(person)) yield {
  				s"email for $lastName is $email"
  			};System.out.println("""res0: com.example.Test2.MayBe[String] = """ + $show(res$0));$skip(149); val res$1 = 
  			
  DB.findPerson(lastName).flatMap{ person =>
  			DB.findMainEmail(person) map { email =>
  				s"email for $lastName is $email"
  			};System.out.println("""res1: com.example.Test2.MayBe[String] = """ + $show(res$1))}
}
