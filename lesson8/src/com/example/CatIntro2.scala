package com.example

class CatIntro2 {

  trait Functor[F[_]] {
    def map[A, B](a: F[A])(f: A => B): F[B]
  }

  object OptionFunctor extends Functor[Option] {
    def map[A, B](a: Option[A])(f: A => B): Option[B] = a map f
  }

  object ListFunctor extends Functor[List] {
    def map[A, B](a: List[A])(f: A => B): List[B] = a map f
  }

  ListFunctor.map(List(1, 2, 3))(_ + 1)

}