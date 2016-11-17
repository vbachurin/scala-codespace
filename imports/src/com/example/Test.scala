package com.example

import scala.collection.mutable.{Map => MutableMap}
import collection._
import mutable.HashMap
import java.util.{Map => JavaMap}
import java.util.{Map => JavaMap, _ }

case class Person(firstName: String, lastName: String)

object Test {
  val p = new Person("A", "B")
  
  def main(args: Array[String]): Unit = {
    import p._
    import p.{firstName => fn}
    val q = fn
    
    println(s"answer=$fn")
    
  }
}
