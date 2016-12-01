package com.example

object CatIntroWs {
  println("Welcome to the Scala worksheet")
  
  def incr(x: Int):Int = x + 1
  
  val incr2 = |>(incr, incr)
}