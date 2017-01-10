package example

object Collections {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val l1 = List(1, 2, 3)                          //> l1  : List[Int] = List(1, 2, 3)

  val l2 = l1 map (_ + 1)                         //> l2  : List[Int] = List(2, 3, 4)

  val l1i = IndexedSeq(1, 2, 3)                   //> l1i  : IndexedSeq[Int] = Vector(1, 2, 3)

  val l2i = l1i map (_ + 1)                       //> l2i  : IndexedSeq[Int] = Vector(2, 3, 4)
}