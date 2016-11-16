package com.example

import scala.annotation.tailrec

object Fibonacci {

  def fib(n: Int) = {
    @tailrec
    def fib1(acc: Int, current: Int, prev: Int): Int = {
      val next = current + prev
      if (next < n) {
        val delta = if (next % 2 == 0) next else 0  
        fib1(acc + delta, next, current)
      } else
        acc
    }
    fib1(0, 1, 0)
  }
  
  def fibStream(n: Int, p: Int): Stream[(Int, Int)] = {
    (n, p) #:: fibStream(n + p, n)
      
  }
  
  def evenFibSum(n: Int) = {
    val s = fibStream(0, 1)
      .map(_._1)
      .filter(_ % 2 == 0)
      .takeWhile ( _ <= n ).sum
  }

  def main(args: Array[String]): Unit = {
    val n = 4000000
    val res = fib(n)
    Console.println(s"fib($n): $res")
    val res2 = evenFibSum(n)
    Console.println(s"fib($n): $res2")
    
  }

}