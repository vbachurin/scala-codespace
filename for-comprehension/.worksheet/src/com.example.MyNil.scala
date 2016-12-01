package com.example

sealed traint MayBy[+A] {
	def foreach(f: A => Unit): Unit
}

case class MySOme[A](val value:A) extends MayBe[A]
case object MyNil extends MayBe[Nothing]

object Test {
  println("Welcome to the Scala worksheet")
}
