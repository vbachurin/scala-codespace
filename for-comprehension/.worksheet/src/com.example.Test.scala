package com.example

object Test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  println("Welcome to the Scala worksheet")

  case class MySome2[A](val value: A) extends MayBe2[A]
  case object MyNone2 extends MayBe2[Nothing]
  
  sealed trait MayBe2[+A] {
    def foreach(f: A => Unit): Unit =
    	this match {
    		case MySome2(a) => f(a)
    		case MyNone2 =>
    	}
  };$skip(293); 

  
  val mb2: MayBe2[Int] = MySome2(3);System.out.println("""mb2  : com.example.Test.MayBe2[Int] = """ + $show(mb2 ));$skip(43); 
  
  for(x <- mb2) {
  	Console.println(x)}
  }
}
