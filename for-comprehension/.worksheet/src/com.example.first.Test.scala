package com.example.first

object Test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
  println("Welcome to the Scala worksheet")

  sealed trait MayBe1[+A] {
    def foreach(f: A => Unit): Unit
  }

  case class MySome1[A](val value: A) extends MayBe1[A] {
    def foreach(f: A => Unit): Unit = f(value)
  }

  case object MyNil1 extends MayBe1[Nothing] {
    def foreach(f: Nothing => Unit): Unit = {}
  };$skip(316); 
  
  val mb: MayBe1[Int] = MySome1(3);System.out.println("""mb  : com.example.first.Test.MayBe1[Int] = """ + $show(mb ));$skip(42); 
  
  for(x <- mb) {
  	Console.println(x)}
  }
}
