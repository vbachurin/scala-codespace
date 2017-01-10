package com.gl

object FuncOp {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def add(x: Int): Int = x + 1                    //> add: (x: Int)Int

  def add2(x: Int = 0, y: Int = 0): Int = x + y   //> add2: (x: Int, y: Int)Int

  add2(y = 1, x = 3)                              //> res0: Int = 4

  def add3(x: Int = 0, y: => Int = 0): Int = x + y + y
                                                  //> add3: (x: Int, y: => Int)Int

  add3(y = { println("y!"); 1 }, x = 3)           //> y!
                                                  //| y!
                                                  //| res1: Int = 5

  def add4(x: Int = 0)(y: => Int = 0): Int = x + y + y
                                                  //> add4: (x: Int)(y: => Int)Int
  add4(3)({ println("y!"); 1 })                   //> y!
                                                  //| y!
                                                  //| res2: Int = 5

  def MyWhile(cond: => Boolean, body: => Unit) = {
    while (cond) {
      body
    }
  }                                               //> MyWhile: (cond: => Boolean, body: => Unit)Unit

  var i = 0                                       //> i  : Int = 0
  var s = 0                                       //> s  : Int = 0
  MyWhile(i < 10, { s += i; i += 1; println(s"$s,$i") })
                                                  //> 0,1
                                                  //| 1,2
                                                  //| 3,3
                                                  //| 6,4
                                                  //| 10,5
                                                  //| 15,6
                                                  //| 21,7
                                                  //| 28,8
                                                  //| 36,9
                                                  //| 45,10
  var r = s                                       //> r  : Int = 45

  def MyWhile2(cond: => Boolean)(body: => Unit) = {
    while (cond) {
      body
    }
  }                                               //> MyWhile2: (cond: => Boolean)(body: => Unit)Unit

  var i2 = 0                                      //> i2  : Int = 0
  var s2 = 0                                      //> s2  : Int = 0
  MyWhile2(i2 < 10) { s2 += i2; i2 += 1; println(s"$s2,$i2") }
                                                  //> 0,1
                                                  //| 1,2
                                                  //| 3,3
                                                  //| 6,4
                                                  //| 10,5
                                                  //| 15,6
                                                  //| 21,7
                                                  //| 28,8
                                                  //| 36,9
                                                  //| 45,10
  var r2 = s2                                     //> r2  : Int = 45

}