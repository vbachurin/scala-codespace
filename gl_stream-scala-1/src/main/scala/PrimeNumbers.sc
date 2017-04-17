import fs2.{Pure, Task, Stream}

def checkDivision(str: String, x: Int, n: Int): Boolean = {
  println(s"$str $x $n")
  (x % n) != 0
}

def nextPrime(n: Int): Stream[Pure, Int] = {
  fs2.Stream.emit(n) ++ nextPrime(n + 1)
    .filter(x => checkDivision("check-1", x, n))
}

val primes = fs2.Stream(1) ++ nextPrime(2)

lazy val s = primes.take(10).toList

/*
def predicate(str: String, x: Int, n: Int): Boolean = {
  println(s"$str $x $n")
  (x % n) != 0
}

def nextPrime2(n: Int, predicate: Int => Boolean): Stream[Pure, Int] = {
  // fs2.Stream.emit(n) // need to move it or exit criteria
//    .filter(x => checkDivision("check-1", x, n))
  nextPrime2(predicate)
}

val primes = fs2.Stream(1) ++ nextPrime2(2)

lazy val s = primes.take(10).toList

/*










