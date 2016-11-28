package com.example

object Map {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Welcome to the Scala worksheet")

  import scala.collection.immutable.List;$skip(72); val res$0 = 
  List(12, 13, 14).map(_ + 1);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(63); 

  val listList = List(12, 13, 14).map { x => List(x, x + 1) };System.out.println("""listList  : List[List[Int]] = """ + $show(listList ));$skip(56); val res$1 = 
  listList.flatMap(xs => xs.head :: xs.head :: xs.tail);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(65); 

 
  val ints: com.example.List[Int] = com.example.List(1, 2, 3);System.out.println("""ints  : com.example.List[Int] = """ + $show(ints ));$skip(29); val res$2 = 

  ints.mapTailrec { _ + 1 }
	
	import scala.collection.immutable;System.out.println("""res2: com.example.List[Int] = """ + $show(res$2));$skip(99); val res$3 = 
	immutable.List(1,2,3).flatMap(x => immutable.List(x, x - 1));System.out.println("""res3: List[Int] = """ + $show(res$3))}
}
