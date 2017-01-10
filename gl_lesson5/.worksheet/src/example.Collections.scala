package example

object Collections {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  println("Welcome to the Scala worksheet");$skip(26); 

  val l = List(1, 2, 3);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(20); 

  val l1 = 4 :: l;System.out.println("""l1  : List[Int] = """ + $show(l1 ));$skip(32); 

  val m = Map(1 -> 2, 2 -> 3);System.out.println("""m  : scala.collection.immutable.Map[Int,Int] = """ + $show(m ));$skip(35); val res$0 = 

  m.map { case (k, v) => k + v };System.out.println("""res0: scala.collection.immutable.Iterable[Int] = """ + $show(res$0));$skip(37); 

  {
    val Some(x) = m.get(1)
  };$skip(84); val res$1 = 

  m.get(4) match {
    case Some(x) if (x % 3 == 1) => x + 1
    case _ => -1
  };System.out.println("""res1: Int = """ + $show(res$1));$skip(112); 

  val f: PartialFunction[Option[Int], Int] = {
    case Some(x) if (x % 3 == 1) => x + 1
    case _ => -1
  };System.out.println("""f  : PartialFunction[Option[Int],Int] = """ + $show(f ));$skip(20); 

  val f1 = f.lift;System.out.println("""f1  : Option[Int] => Option[Int] = """ + $show(f1 ));$skip(36); 

  val il = IndexedSeq(2, 4, 4, 5);System.out.println("""il  : IndexedSeq[Int] = """ + $show(il ));$skip(27); 

  val a = Array(2, 3, 4);System.out.println("""a  : Array[Int] = """ + $show(a ))}
  
  

}
