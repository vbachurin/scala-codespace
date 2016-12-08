package com.example

object Implicits {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  trait A {

  }

  trait B

  import scala.languageFeature.implicitConversions
  implicit def f(a: String): Int = {
    Integer.parseInt(a)
  }                                               //> f: (a: String)Int
/*
  implicit def f2(a: String): Int = {
    Integer.parseInt(a)
  }
  */
  def g(b: Int): Unit = {
    System.out.println(s"b % 2 == ${b % 2}")
  }                                               //> g: (b: Int)Unit

  // if remove implicit  f()
  def g2(b: Int)(implicit f: String => Int): Unit = {
    System.out.println(s"b % 2 == ${b % 2}")
  }                                               //> g2: (b: Int)(implicit f: String => Int)Unit

  val x = "123"                                   //> x  : String = 123
  g(x)                                            //> b % 2 == 1
  val xx: Int = f("123")                          //> xx  : Int = 123
  g(xx)                                           //> b % 2 == 1
  val y: Int = 123                                //> y  : Int = 123
  // wouldn't work w/o implicit
  g(y)                                            //> b % 2 == 1


	val x1: Either[Throwable, Int] = ???      //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:230)
                                                  //| 	at com.example.Implicits$$anonfun$main$1.apply$mcV$sp(com.example.Implic
                                                  //| its.scala:39)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at com.example.Implicits$.main(com.example.Implicits.scala:3)
                                                  //| 	at com.example.Implicits.main(com.example.Implicits.scala)
	val y1: Either[String, Int] = ???
	
	x1.left.map(_.getMessage)
	
	val getMessage: Throwable => String = _.getMessage

}