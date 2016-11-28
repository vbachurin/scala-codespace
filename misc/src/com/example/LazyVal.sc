package com.example

object LazyVal {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet\

  object FunctionParamsExample {

    def byValue(x: String, nCalls: Int) {
      val sb = new StringBuilder()
      for (i <- 1 to nCalls) {
        sb.append(x)
      }
      Console.println(sb.toString)
    }

    def byName(x: => String, nCalls: Int) {
      val sb = new StringBuilder()
      for (i <- 1 to nCalls) {
        sb.append(x)
      }
      Console.println(sb.toString)
    }

    def byNameLazy(x: => String, nCalls: Int) {
      lazy val lx = x
      val sb = new StringBuilder()
      for (i <- 1 to nCalls) {
        sb.append(lx)
      }
      Console.println(sb.toString)
    }

    def funByValue(x: () => String, nCalls: Int) {
      val sb = new StringBuilder();
      for (i <- 1 to nCalls) {
        sb.append(x());
      }
      Console.println(sb.toString);
    }
    
    def loop(): Unit = loop()
    
    def doN(n: Int)(f: => Unit): Unit = {
    	for(i <- 1 to n) f
    }

  }


	import FunctionParamsExample._
	
  //{System.out.println("A");"1"}
  byNameLazy({ System.out.println("A"); "1" }, 0)

  FunctionParamsExample.byNameLazy({ System.out.println("A"); "1" }, 3)
}