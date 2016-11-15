package com.helloworld

import java.io.IOException



object Test {
  
  @throws[IOException]
  def main(args: Array[String]): Unit = {
    val test:Test = new Test()
    val testObject = Test
    Console.println(s"AAAA, test is $test, Test is $Test, testObject is $testObject")
    
//    throw new RuntimeException("Be-be-be")
  }
  override def toString = "BBB"
  
}

class Test {
  override def toString = "AAA"
}