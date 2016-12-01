package com.example

object CatIntroWs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
  println("Welcome to the Scala worksheet");$skip(34); 
  
  def incr(x: Int):Int = x + 1;System.out.println("""incr: (x: Int)Int""");$skip(32); 
  
  val incr2 = |>(incr, incr);System.out.println("""incr2  : <error> = """ + $show(incr2 ))}
}
