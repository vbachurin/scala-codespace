package com.helloworld

object WS1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val t1: Test = new Test                         //> t1  : com.helloworld.Test = com.helloworld.Test@7f63425a
  
  val t2: Test = new Test                         //> t2  : com.helloworld.Test = com.helloworld.Test@36d64342
  
  t1 == t2                                        //> res0: Boolean = true
  t1 eq t2                                        //> res1: Boolean = false
  
  t1 == null                                      //> res2: Boolean = false
  null.isInstanceOf[Test]                         //> res3: Boolean = false
  null.isInstanceOf[AnyRef]                       //> res4: Boolean = false
  val x: Any = null                               //> x  : Any = null
  val xx: Null = null                             //> xx  : Null = null
  
  //class X1 extends Null
  //val x1 = new X1
  //x1 eq null
  //null.isInstanceOf[Null]
  
  val x2: Any = 3                                 //> x2  : Any = 3
  //val x3: AnyRef = 3
  val x3: AnyVal = 3                              //> x3  : AnyVal = 3
  
  class X4(val x: Int) extends AnyVal {
  
  }
  /*
  val x4 = new X4(4)
  */
}