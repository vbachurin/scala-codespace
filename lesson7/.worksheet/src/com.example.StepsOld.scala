package com.example

object StepsOld {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  println("Welcome to the Scala worksheet")}
  
  class CatObj
  
  trait CatArrow[X<:CatObj, Y<:CatObj] {
    def x: X
    def y: Y
    
    //def apply()
    
    def |>[Z] (g:CatArrow[Y,Z]):CatArrow[X,Z]
  }
  
}
