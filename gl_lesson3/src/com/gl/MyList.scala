package com.gl

sealed trait MyList[+T] {

  thisMyList =>

  final def length(): Int = {
    this match {
      case MyNil => 0
      case Cons(h, t) => 1 + t.length
    }
  }

  def map[S](f: T => S): MyList[S] = {
    this match {
      case Cons(head, tail) => Cons(f(head), tail map f)
      case MyNil => MyNil
    }
  }

  final def filter(p: T => Boolean): MyList[T] =
    this match {
      case Cons(head, tail) => if (p(head)) this else (tail filter p)
      case MyNil => MyNil
    }

  class Filtered(p: T => Boolean) {
    def map[S](f: T => S): MyList[S] =
      thisMyList match {
        case Cons(head, tail) =>
          if (p(head))
            Cons(f(head), new tail.Filtered(p) map f)
          else
            new tail.Filtered(p) map f
        case MyNil => MyNil
      }
  }

  final def withFilter(p: T => Boolean) = new Filtered(p)

  def head(): T
  def prepend[S >: T](x: S): MyList[S] = Cons(x, this)

}

case class Cons[T](head: T, tail: MyList[T]) extends MyList[T]

case object MyNil extends MyList[Nothing] {
  def head(): Nothing = throw new Exception
}