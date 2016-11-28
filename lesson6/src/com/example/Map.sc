package com.example

object Map {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  import scala.collection.immutable.List
  List(12, 13, 14).map(_ + 1)                     //> res0: List[Int] = List(13, 14, 15)

  val listList = List(12, 13, 14).map { x => List(x, x + 1) }
                                                  //> listList  : List[List[Int]] = List(List(12, 13), List(13, 14), List(14, 15))
                                                  //| 
  listList.flatMap(xs => xs.head :: xs.head :: xs.tail)
                                                  //> res1: List[Int] = List(12, 12, 13, 13, 13, 14, 14, 14, 15)

 
  val ints: com.example.List[Int] = com.example.List(1, 2, 3)
                                                  //> ints  : com.example.List[Int] = Cons(1,Cons(2,Cons(3,Nil)))

  ints.mapTailrec { _ + 1 }                       //> res2: com.example.List[Int] = Cons(4,Cons(3,Cons(2,Nil)))
	
	import scala.collection.immutable
	immutable.List(1,2,3).flatMap(x => immutable.List(x, x - 1))
                                                  //> res3: List[Int] = List(1, 0, 2, 1, 3, 2)
}