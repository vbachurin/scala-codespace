package com.example

sealed trait MayBe[+A] {
	def foreach(f: A => Unit): Unit
}

case class MySome[A](val value:A) extends MayBe[A] {
	def foreach(f: A => Unit): Unit = f(value)
}

case object MyNil extends MayBe[Nothing] {
	def foreach(f: Nothing => Unit): Unit = {}
}


object Test {
  println("Welcome to the Scala worksheet")
}
