package com.example

class CatIntro {
  
  trait Function[A,B] {
    def apply(f:A):B
  }
  
  trait Endofunction[A] extends Function[A,A] {
    def apply(a: A): A
  }
  
  class Identity[A] extends Endofunction[A] {
    def apply(a: A):A = a
  }
  
  trait Functor[A[_], B[_]] {
    def apply[S](a:A[S]):B[S]
  }
  
  // '_' can also stand for something like 'F[X] forSome X <: Any]'
  trait Endofunctor[F[_]] {
    def apply[A](f:F[A]):F[A]
  }
  
  trait Monadic[F[_]] extends Endofunctor[F] {
    def map[A,B](f:A=>B):F[A] => F[B]
    
    def flatMap[A,B](f:A=>F[B]): F[A] => F[B]
  }
  
  trait XWithMyFor[A] {
    def map[A,B](f:A=>B): XWithMyFor[B]
    
  }
  
  trait Seq[A] {
    def length: Int
    def apply(i:Int):Option[A]
  }

  trait M[A] {
    def map[B](f: A => B):M[B]
  }
  
  /*
   * also possible
  trait M1 {
    def map[A, B](f: A => B):M1
  }
  
  */
  
  def |>[A,B,C](f:A=>B,g:B=>C): A=>C = {
    a => g(f(a))
  }
  
  
}