package com.example

sealed trait List[+A] {

  def foldRight[B](neutral: B)(op: (A, B) => B): B = {
    this match {
      case Cons(head, tail) => op(head, tail.foldRight(neutral)(op))
      case Nil => neutral
    }
  }

  def foldLeft[B](neutral: B)(op: (B, A) => B): B = {
    this match {
      case Cons(head, tail) => tail.foldLeft(op(neutral, head))(op)
      case Nil => neutral
    }
  }

  def foldLeft1[B](neutral: B)(op: (A, B) => B): B = {
    this match {
      case Cons(head, tail) => tail.foldLeft1(op(head, neutral))(op)
      case Nil => neutral
    }
  }

  def map[B](f: A => B): List[B] = this match {
    case Cons(head, tail) => Cons(f(head), tail.map(f))
    case Nil => Nil
  }

  // do using foldRight (preferably tailrec) 
  def mapTailrec[B](f: A => B): List[B] =
    this.foldLeft(Nil.asInstanceOf[List[B]])((b, a) => Cons(f(a), b))
  /*  
  def flatMap[B](f: A => List[B]): List[B]): List[B] = 
	*/
}

case object Nil extends List[Nothing]
case class Cons[A](head: A, tail: List[A]) extends List[A]

object List {
  def apply[A](elems: A*): List[A] =
    if (elems.isEmpty) Nil else Cons[A](elems.head, apply(elems.tail: _*))
  // _* -> convert tail to varargs
}