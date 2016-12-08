package com.example

object CatIntro3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  trait Functor[F[_]] {
    def map[A, B](a: F[A])(f: A => B): F[B]
  }

  object OptionFunctor extends Functor[Option] {
    def map[A, B](a: Option[A])(f: A => B): Option[B] = a map f
  }

  object ListFunctor extends Functor[List] {
    def map[A, B](a: List[A])(f: A => B): List[B] = a map f
  }


	ListFunctor.map(List(1, 2, 3))(_ + 1)     //> res0: List[Int] = List(2, 3, 4)
  List(1, 2, 3) map (_ + 1)                       //> res1: List[Int] = List(2, 3, 4)
	//ListFunctor map List(1, 2, 3)(_ + 1)
}