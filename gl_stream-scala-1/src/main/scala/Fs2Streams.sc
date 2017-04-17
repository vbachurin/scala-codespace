import fs2.{Pure, Task, Stream}

def nextS(x:Int): Stream[Pure, Int] = {
  Stream[Pure, Int](x) ++ nextS(x + 1)
}

lazy val s1 = nextS(1)

val s: fs2.Stream[Pure, Int]  =
  fs2.Stream[Pure, Int](1) ++
    fs2.Stream.emit(2) ++
    fs2.Stream.iterate(1)(+_ + 1)

s.take(10).toList

val s3 = fs2.Stream[Task, Int](11,22) ++ Stream.fail(new RuntimeException) ++
  Stream[Task, Int](33,44)

s3.take(2).runLog.unsafeRun()


val fibs: fs2.Stream[Task, Int] = fs2.Stream[Task, Int](1,2) ++
  fibs.zip(fibs.tail).map{ case (x,y) => x + y }