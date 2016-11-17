package com.example

object Primes {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(135); 

  def checkCandidate(primes: Set[Long], candidate: Long) = {
    primes.contains(candidate)
  };System.out.println("""checkCandidate: (primes: Set[Long], candidate: Long)Boolean""");$skip(404); 

  def buildPrimes(n: Long): Set[Long] = {
    var primes: Set[Long] = Set()
    var candidate: Int = 2;
    while (candidate < n) {
      //for (candidate <- 2L to n) {
      var foundDiv = false
      for (p <- primes if !foundDiv) {
        if (candidate % p == 0)
          foundDiv = true
      }
      if (!foundDiv) {
        primes += candidate
      }
      candidate += 1
    }
    primes
  };System.out.println("""buildPrimes: (n: Long)Set[Long]""");$skip(18); val res$0 = 
  buildPrimes(10);System.out.println("""res0: Set[Long] = """ + $show(res$0));$skip(216); 

  def primeFactors(n: Long): Set[Long] = {
    val primes = buildPrimes(n / 2 + 1)
    var retval: Set[Long] = Set()
    for (p <- primes) {
      if (n % p == 0) {
        retval += p
      }
    }
    retval
  };System.out.println("""primeFactors: (n: Long)Set[Long]""");$skip(23); val res$1 = 

  primeFactors(100L);System.out.println("""res1: Set[Long] = """ + $show(res$1))}

}
