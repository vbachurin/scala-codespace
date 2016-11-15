package com.helloworld

object WS1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(29); 
  
  val t1: Test = new Test;System.out.println("""t1  : com.helloworld.Test = """ + $show(t1 ));$skip(29); 
  
  val t2: Test = new Test;System.out.println("""t2  : com.helloworld.Test = """ + $show(t2 ));$skip(14); val res$0 = 
  
  t1 == t2;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(11); val res$1 = 
  t1 eq t2;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(16); val res$2 = 
  
  t1 == null;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(26); val res$3 = 
  null.isInstanceOf[Test];System.out.println("""res3: Boolean = """ + $show(res$3));$skip(28); val res$4 = 
  null.isInstanceOf[AnyRef];System.out.println("""res4: Boolean = """ + $show(res$4));$skip(20); 
  val x: Any = null;System.out.println("""x  : Any = """ + $show(x ));$skip(22); 
  val xx: Null = null;System.out.println("""xx  : Null = """ + $show(xx ));$skip(114); 
  
  //class X1 extends Null
  //val x1 = new X1
  //x1 eq null
  //null.isInstanceOf[Null]
  
  val x2: Any = 3;System.out.println("""x2  : Any = """ + $show(x2 ));$skip(44); 
  //val x3: AnyRef = 3
  val x3: AnyVal = 3;System.out.println("""x3  : AnyVal = """ + $show(x3 ))}
  
  class X4(val x: Int) extends AnyVal {
  
  }
  /*
  val x4 = new X4(4)
  */
}
