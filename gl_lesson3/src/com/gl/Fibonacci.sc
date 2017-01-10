package com.gl

object Fibonacci {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def fib(n: Int): Int = {
    n match {
      case 0 => 0
      case 1 => 1
      case _ => fib(n - 1) + fib(n - 2)
    }
  }                                               //> fib: (n: Int)Int

  def fib1(n: Int): Int = {
    def fiba(curr: Int, prev: Int, count: Int): Int = {
      if (count == n)
        curr
      else {
        fiba(curr + prev, curr, count + 1)
      }
    }
    fiba(1, 0, 1)
  }                                               //> fib1: (n: Int)Int

  def fib2(n: Int): Int =
    {
      var count = 1
      var prev = 0
      var curr = 1
      while (count != n) {
        val tmp = curr
        curr = curr + prev
        prev = tmp
        count = count + 1
      }
      curr
    }                                             //> fib2: (n: Int)Int

}