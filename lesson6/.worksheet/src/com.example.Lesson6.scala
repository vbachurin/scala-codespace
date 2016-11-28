package com.example

object Lesson6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  
  val seq = Seq(1, 2, 3);System.out.println("""seq  : Seq[Int] = """ + $show(seq ));$skip(39); 
  
  val indSeq = IndexedSeq(1.2, 2.3);System.out.println("""indSeq  : IndexedSeq[Double] = """ + $show(indSeq ));$skip(60); 
  
  val set = Set("n", "i", "j")
  
  .immutable.SortedSet;System.out.println("""set  : <error> = """ + $show(set ));$skip(43); 
  val sortedSet = SortedSet(1, 2, 2, 3, 2);System.out.println("""sortedSet  : <error> = """ + $show(sortedSet ));$skip(49); 
  
  val map = Map(1 -> "a", 2 -> "b", 3 -> "c");System.out.println("""map  : <error> = """ + $show(map ));$skip(15); val res$0 = 
	map.map(_._1);System.out.println("""res0: <error> = """ + $show(res$0));$skip(29); val res$1 = 
	
	sortedSet map(_.toString)
	
	import com.example.List;System.out.println("""res1: <error> = """ + $show(res$1));$skip(88); 
	val ints: com.example.List[Int] = com.example.List(1, 2, 3);System.out.println("""ints  : com.example.List[Int] = """ + $show(ints ));$skip(108); 
	def sum(l: List[Int]): Int =
		l match {
			case Cons(head, tail) => head + sum(tail)
			case Nil => 0
		};System.out.println("""sum: (l: com.example.List[Int])Int""");$skip(115); 
	
	def product(xs: List[Int]): Int = xs match {
		case Cons(head, tail) => head * product(tail)
		case Nil => 1
	};System.out.println("""product: (xs: com.example.List[Int])Int""");$skip(13); val res$2 = 
	
	sum(ints);System.out.println("""res2: Int = """ + $show(res$2));$skip(15); val res$3 = 
	product(ints);System.out.println("""res3: Int = """ + $show(res$3));$skip(60); 
	
	def sumfold(xs: List[Int]): Int = xs.foldRight(0)(_ + _);System.out.println("""sumfold: (xs: com.example.List[Int])Int""");$skip(15); val res$4 = 
	sumfold(ints);System.out.println("""res4: Int = """ + $show(res$4));$skip(64); 
	
	def productfold(xs: List[Int]): Int = xs.foldRight(1)(_ * _);System.out.println("""productfold: (xs: com.example.List[Int])Int""");$skip(19); val res$5 = 
	productfold(ints);System.out.println("""res5: Int = """ + $show(res$5));$skip(51); val res$6 = 
	
	ints.foldRight("zero")((x, z) => s"($x op $z)");System.out.println("""res6: String = """ + $show(res$6));$skip(51); val res$7 = 
	
	ints.foldLeft("zero")((z, x) => s"($z op $x))");System.out.println("""res7: String = """ + $show(res$7));$skip(52); val res$8 = 
	
	ints.foldLeft1("zero")((x, z) => s"($x op $z))");System.out.println("""res8: String = """ + $show(res$8))}
	
}
