package com.example

object LazyVal {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  println("Welcome to the Scala worksheet")

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


	import FunctionParamsExample._;$skip(1039); 
	
  //{System.out.println("A");"1"}
  byNameLazy({ System.out.println("A"); "1" }, 0);$skip(74); 

  FunctionParamsExample.byNameLazy({ System.out.println("A"); "1" }, 3)}
}
