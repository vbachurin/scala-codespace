package com.gl

object FuncOp {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(33); 

  def add(x: Int): Int = x + 1;System.out.println("""add: (x: Int)Int""");$skip(50); 

  def add2(x: Int = 0, y: Int = 0): Int = x + y;System.out.println("""add2: (x: Int, y: Int)Int""");$skip(23); val res$0 = 

  add2(y = 1, x = 3);System.out.println("""res0: Int = """ + $show(res$0));$skip(57); 

  def add3(x: Int = 0, y: => Int = 0): Int = x + y + y;System.out.println("""add3: (x: Int, y: => Int)Int""");$skip(42); val res$1 = 

  add3(y = { println("y!"); 1 }, x = 3);System.out.println("""res1: Int = """ + $show(res$1));$skip(57); 

  def add4(x: Int = 0)(y: => Int = 0): Int = x + y + y;System.out.println("""add4: (x: Int)(y: => Int)Int""");$skip(32); val res$2 = 
  add4(3)({ println("y!"); 1 });System.out.println("""res2: Int = """ + $show(res$2));$skip(93); 

  def MyWhile(cond: => Boolean, body: => Unit) = {
    while (cond) {
      body
    }
  };System.out.println("""MyWhile: (cond: => Boolean, body: => Unit)Unit""");$skip(14); 

  var i = 0;System.out.println("""i  : Int = """ + $show(i ));$skip(12); 
  var s = 0;System.out.println("""s  : Int = """ + $show(s ));$skip(57); 
  MyWhile(i < 10, { s += i; i += 1; println(s"$s,$i") });$skip(12); 
  var r = s;System.out.println("""r  : Int = """ + $show(r ));$skip(94); 

  def MyWhile2(cond: => Boolean)(body: => Unit) = {
    while (cond) {
      body
    }
  };System.out.println("""MyWhile2: (cond: => Boolean)(body: => Unit)Unit""");$skip(15); 

  var i2 = 0;System.out.println("""i2  : Int = """ + $show(i2 ));$skip(13); 
  var s2 = 0;System.out.println("""s2  : Int = """ + $show(s2 ));$skip(63); 
  MyWhile2(i2 < 10) { s2 += i2; i2 += 1; println(s"$s2,$i2") };$skip(14); 
  var r2 = s2;System.out.println("""r2  : Int = """ + $show(r2 ))}

}
