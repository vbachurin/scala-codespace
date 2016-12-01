package com.example

import scala.IndexedSeq

class ForComprehentionTest {

  //  test("for-by-rowss") {
  //  }

}

object ForComprehentionTest {
  def main(args: Array[String]): Unit = {
    val data = IndexedSeq(
      IndexedSeq(1, 0, 0, 1, 2),
      IndexedSeq(1, 0, 1, 0, 2),
      IndexedSeq(0, 1, 0, 0, 2),
      IndexedSeq(1, 0, 0, 0, 2))

    var transformed = {
      for {
        colIndex <- data(0).indices} yield 
        for {rowIndex <- data(colIndex).indices 
          field = data(rowIndex)(colIndex)
      } yield {
        Console.println(s"$rowIndex,$colIndex,$field")
      }
    }
    
    val row = data(0)
    
    for (row <- data) yield row(0)
    
    for {colIndex <- 0 until data(0).length } yield {
      for { row <- data } yield row(colIndex)
    }
  }
}