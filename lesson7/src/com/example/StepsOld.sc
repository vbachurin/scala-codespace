package com.example

object StepsOld {
  println("Welcome to the Scala worksheet")
  
  class CatObj
  
  trait CatArrow[X<:CatObj, Y<:CatObj] {
    def x: X
    def y: Y
    
    //def apply()
    
    def |>[Z] (g:CatArrow[Y,Z]):CatArrow[X,Z]
  }
  
}