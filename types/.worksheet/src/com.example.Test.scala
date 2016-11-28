package com.example

case class Test(val data: Array[Array[Option[Int]]]) {
  def this(n: Int) = {
    this(data = (1 to n) map { _ => (1 to n) map (_ => None) })
  }

}
/*
case class Cons[A](head: A, tail: Cn[A]) extends Cn[A]
case object CnNil extends Cn[Nothing]

sealed class Cn[+A] {
  def consA(a: A): Cn[A] =
    Cons(a, this)

  def cons[B >: A](b: B): Cn[B] =
    Cons(b, this)

  Cons(3, CnNil).cons("A")

}
*/
// ?????????????? / ?????????????? (?????????? / ???????)
// Cn[+A]: B <: A -> Cn[B] <: Cn[A]
// Cn[-A]: B >: A -> Cn[B] <: Cn[A]

object Test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(609); 
  println("Welcome to the Scala worksheet")

  class A(x: Int)

  trait B0 {
    def b: Int = 0
  }

  trait B1 {
    def b: Int = 1
  }

  trait B2 extends B0 {
    override def b: Int = 2

  }

  class C(x: Int) extends A(x) with B1 with B2 {
    override def b: Int = 3
  };$skip(254); 

  val c = new C(10);System.out.println("""c  : com.example.Test.C = """ + $show(c ));$skip(6); val res$0 = 
  c.b;System.out.println("""res0: Int = """ + $show(res$0))}
}
