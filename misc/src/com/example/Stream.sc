package com.example

object Stream {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  trait MyStream[+A]
  
  case object MyStreamEmpty extends MyStream[Nothing]
  
  class Cons[A](head: A, tail: => MyStream[A]) extends MyStream[A]
  
	def from(n: Int): MyStream[Int] =
		new Cons(n, from(n + 1))          //> from: (n: Int)com.example.Stream.MyStream[Int]
		
}