package com.example

object Stream {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet")
  
  trait MyStream[+A]
  
  case object MyStreamEmpty extends MyStream[Nothing]
  
  class Cons[A](head: A, tail: => MyStream[A]) extends MyStream[A];$skip(216); 
  
	def from(n: Int): MyStream[Int] =
		new Cons(n, from(n + 1));System.out.println("""from: (n: Int)com.example.Stream.MyStream[Int]""")}
		
}
