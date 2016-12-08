package com.example

object CatIntro3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
  println("Welcome to the Scala worksheet")
  
  
  trait Functor[F[_]] {
    def map[A, B](a: F[A])(f: A => B): F[B]
  }

  object OptionFunctor extends Functor[Option] {
    def map[A, B](a: Option[A])(f: A => B): Option[B] = a map f
  }

  object ListFunctor extends Functor[List] {
    def map[A, B](a: List[A])(f: A => B): List[B] = a map f
  };$skip(347); val res$0 = 


	ListFunctor.map(List(1, 2, 3))(_ + 1);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(28); val res$1 = 
  List(1, 2, 3) map (_ + 1);System.out.println("""res1: List[Int] = """ + $show(res$1))}
	//ListFunctor map List(1, 2, 3)(_ + 1)
}
