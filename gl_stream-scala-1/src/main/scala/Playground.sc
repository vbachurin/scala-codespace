import scala.collection.immutable.Stream.cons
//val s: Stream[Int] = Stream.from(0)

//val s = Stream(1)

1 #:: Stream.Empty

def nextS(x: Int):Stream[Int] = {
  cons(x, nextS(x+1))
}

val s:Stream[Int] = nextS(1)
s.take(10).toList


lazy val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map {
  n =>
    val r = n._1 + n._2
    println(s"r=${r}")
    r
}

fibs.take(10).toList