package com.gl

object FuncOp2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Welcome to the Scala worksheet")

  object X {
    def logEnabled: Boolean = false

    def log(messageExternal: => String): Unit = {

      lazy val message = messageExternal
      if (logEnabled) {
        Console.println(s"Message: ${message}")
        remoteLog(s"message: ${message}")
      }

    }

    def remoteLog(message: String): Unit = {}

  };$skip(389); 

  val add2two: Function1[Int, Function1[Int, Int]] = ???;System.out.println("""add2two  : Int => (Int => Int) = """ + $show(add2two ))}
}
