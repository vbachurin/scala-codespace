package example

object PartFunc {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet


  val func: PartialFunction[Int, Int] = {
    case x: Int if (x < 9) => 1

  }                                               //> func  : PartialFunction[Int,Int] = <function1>
  
  
  func(8)                                         //> res0: Int = 1
  func(10)                                        //> scala.MatchError: 10 (of class java.lang.Integer)
                                                  //| 	at scala.PartialFunction$$anon$1.apply(PartialFunction.scala:253)
                                                  //| 	at scala.PartialFunction$$anon$1.apply(PartialFunction.scala:251)
                                                  //| 	at example.PartFunc$$anonfun$main$1$$anonfun$1.applyOrElse(example.PartF
                                                  //| unc.scala:7)
                                                  //| 	at example.PartFunc$$anonfun$main$1$$anonfun$1.applyOrElse(example.PartF
                                                  //| unc.scala:7)
                                                  //| 	at scala.runtime.AbstractPartialFunction$mcII$sp.apply$mcII$sp(AbstractP
                                                  //| artialFunction.scala:36)
                                                  //| 	at example.PartFunc$$anonfun$main$1.apply$mcV$sp(example.PartFunc.scala:
                                                  //| 14)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at example.PartFunc$.main(example.PartFunc.scala:3)
                                                  //| 	at ex
                                                  //| Output exceeds cutoff limit.
}