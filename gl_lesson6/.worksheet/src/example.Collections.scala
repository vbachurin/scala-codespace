package example

object Collections {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  println("Welcome to the Scala worksheet");$skip(26); 

  val l1 = List(1, 2, 3);System.out.println("""l1  : List[Int] = """ + $show(l1 ));$skip(27); 

  val l2 = l1 map (_ + 1);System.out.println("""l2  : List[Int] = """ + $show(l2 ));$skip(33); 

  val l1i = IndexedSeq(1, 2, 3);System.out.println("""l1i  : IndexedSeq[Int] = """ + $show(l1i ));$skip(29); 

  val l2i = l1i map (_ + 1);System.out.println("""l2i  : IndexedSeq[Int] = """ + $show(l2i ))}
}
