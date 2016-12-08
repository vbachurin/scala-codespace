package com.example

object Implicits {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
  println("Welcome to the Scala worksheet")

  trait A {

  }

  trait B

  import scala.languageFeature.implicitConversions;$skip(150); 
  implicit def f(a: String): Int = {
    Integer.parseInt(a)
  };System.out.println("""f: (a: String)Int""");$skip(149); 
/*
  implicit def f2(a: String): Int = {
    Integer.parseInt(a)
  }
  */
  def g(b: Int): Unit = {
    System.out.println(s"b % 2 == ${b % 2}")
  };System.out.println("""g: (b: Int)Unit""");$skip(134); 

  // if remove implicit  f()
  def g2(b: Int)(implicit f: String => Int): Unit = {
    System.out.println(s"b % 2 == ${b % 2}")
  };System.out.println("""g2: (b: Int)(implicit f: String => Int)Unit""");$skip(17); 

  val x = "123";System.out.println("""x  : String = """ + $show(x ));$skip(7); 
  g(x);$skip(25); 
  val xx: Int = f("123");System.out.println("""xx  : Int = """ + $show(xx ));$skip(8); 
  g(xx);$skip(19); 
  val y: Int = 123;System.out.println("""y  : Int = """ + $show(y ));$skip(39); 
  // wouldn't work w/o implicit
  g(y);$skip(40); 


	val x1: Either[Throwable, Int] = ???;System.out.println("""x1  : Either[Throwable,Int] = """ + $show(x1 ));$skip(35); 
	val y1: Either[String, Int] = ???;System.out.println("""y1  : Either[String,Int] = """ + $show(y1 ));$skip(29); val res$0 = 
	
	x1.left.map(_.getMessage);System.out.println("""res0: Product with Serializable with scala.util.Either[String,Int] = """ + $show(res$0));$skip(54); 
	
	val getMessage: Throwable => String = _.getMessage;System.out.println("""getMessage  : Throwable => String = """ + $show(getMessage ))}

}
