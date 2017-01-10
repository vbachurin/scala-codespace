package com.gl

object Fibonacci {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  println("Welcome to the Scala worksheet");$skip(129); 

  def fib(n: Int): Int = {
    n match {
      case 0 => 0
      case 1 => 1
      case _ => fib(n - 1) + fib(n - 2)
    }
  };System.out.println("""fib: (n: Int)Int""");$skip(213); 

  def fib1(n: Int): Int = {
    def fiba(curr: Int, prev: Int, count: Int): Int = {
      if (count == n)
        curr
      else {
        fiba(curr + prev, curr, count + 1)
      }
    }
    fiba(1, 0, 1)
  };System.out.println("""fib1: (n: Int)Int""");$skip(239); 

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
    };System.out.println("""fib2: (n: Int)Int""")}

}
