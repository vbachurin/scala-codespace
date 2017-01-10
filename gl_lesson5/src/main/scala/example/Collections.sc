package example

object Collections {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val l = List(1, 2, 3)                           //> l  : List[Int] = List(1, 2, 3)

  val l1 = 4 :: l                                 //> l1  : List[Int] = List(4, 1, 2, 3)

  val m = Map(1 -> 2, 2 -> 3)                     //> m  : scala.collection.immutable.Map[Int,Int] = Map(1 -> 2, 2 -> 3)

  m.map { case (k, v) => k + v }                  //> res0: scala.collection.immutable.Iterable[Int] = List(3, 5)

  {
    val Some(x) = m.get(1)
  }

  m.get(4) match {
    case Some(x) if (x % 3 == 1) => x + 1
    case _ => -1
  }                                               //> res1: Int = -1

  val f: PartialFunction[Option[Int], Int] = {
    case Some(x) if (x % 3 == 1) => x + 1
    case _ => -1
  }                                               //> f  : PartialFunction[Option[Int],Int] = <function1>

  val f1 = f.lift                                 //> f1  : Option[Int] => Option[Int] = <function1>

  val il = IndexedSeq(2, 4, 4, 5)                 //> il  : IndexedSeq[Int] = Vector(2, 4, 4, 5)

  val a = Array(2, 3, 4)                          //> a  : Array[Int] = Array(2, 3, 4)
  
  

}