package com.example

object Primes {

  def checkCandidate(primes: Set[Long], candidate: Long) = {
    primes.contains(candidate)
  }                                               //> checkCandidate: (primes: Set[Long], candidate: Long)Boolean

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
  }                                               //> buildPrimes: (n: Long)Set[Long]
  buildPrimes(10)                                 //> res0: Set[Long] = Set(2, 3, 5, 7)

  def primeFactors(n: Long): Set[Long] = {
    val primes = buildPrimes(n / 2 + 1)
    var retval: Set[Long] = Set()
    for (p <- primes) {
      if (n % p == 0) {
        retval += p
      }
    }
    retval
  }                                               //> primeFactors: (n: Long)Set[Long]

  primeFactors(100L)                              //> res1: Set[Long] = Set(5, 2)

}