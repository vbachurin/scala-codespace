package com.example

object Lesson6 {
  
  val seq = Seq(1, 2, 3)
  
  val indSeq = IndexedSeq(1.2, 2.3)
  
  val set = Set("n", "i", "j")
  
  .immutable.SortedSet
  val sortedSet = SortedSet(1, 2, 2, 3, 2)
  
  val map = Map(1 -> "a", 2 -> "b", 3 -> "c")
	map.map(_._1)
	
	sortedSet map(_.toString)
	
	import com.example.List
	val ints: com.example.List[Int] = com.example.List(1, 2, 3)
	def sum(l: List[Int]): Int =
		l match {
			case Cons(head, tail) => head + sum(tail)
			case Nil => 0
		}
	
	def product(xs: List[Int]): Int = xs match {
		case Cons(head, tail) => head * product(tail)
		case Nil => 1
	}
	
	sum(ints)
	product(ints)
	
	def sumfold(xs: List[Int]): Int = xs.foldRight(0)(_ + _)
	sumfold(ints)
	
	def productfold(xs: List[Int]): Int = xs.foldRight(1)(_ * _)
	productfold(ints)
	
	ints.foldRight("zero")((x, z) => s"($x op $z)")
	
	ints.foldLeft("zero")((z, x) => s"($z op $x))")
	
	ints.foldLeft1("zero")((x, z) => s"($x op $z))")
	
}