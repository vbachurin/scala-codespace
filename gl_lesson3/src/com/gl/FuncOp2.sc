package com.gl

object FuncOp2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

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

  }

  val add2two: Function1[Int, Function1[Int, Int]] = ???
                                                  //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:230)
                                                  //| 	at com.gl.FuncOp2$$anonfun$main$1.apply$mcV$sp(com.gl.FuncOp2.scala:23)
                                                  //| 
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at com.gl.FuncOp2$.main(com.gl.FuncOp2.scala:3)
                                                  //| 	at com.gl.FuncOp2.main(com.gl.FuncOp2.scala)
}