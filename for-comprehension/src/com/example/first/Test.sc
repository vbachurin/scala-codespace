package com.example.first

object Test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  sealed trait MayBe1[+A] {
    def foreach(f: A => Unit): Unit
  }

  case class MySome1[A](val value: A) extends MayBe1[A] {
    def foreach(f: A => Unit): Unit = f(value)
  }

  case object MyNil1 extends MayBe1[Nothing] {
    def foreach(f: Nothing => Unit): Unit = {}
  }
  
  val mb: MayBe1[Int] = MySome1(3)                //> mb  : com.example.first.Test.MayBe1[Int] = MySome1(3)
  
  for(x <- mb) {
  	Console.println(x)                        //> 3
  }
}