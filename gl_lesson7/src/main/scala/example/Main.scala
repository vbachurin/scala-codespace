package example

import java.io.File
import scala.util.Try

// type Unlimit: monthly fee
// type SMS - 0.01$ * baseCost, 

//TODO implement 2 types of tariff plans
// customer who has second TP can have additional fields - their rate coefficients

//  input read file (CSV with UserAction)
//  output tariff id and sum
// in other words
// user, type of user and sum
// to file or console (from SubscriberRate)

trait CSVEncoding[T] {
  def decode(s: String): Either[String, T]

  def encode(t: T): Either[String, T]
}

case class SubscriberRate(userId: Long, start: Long, end: Long, tariffPlanName: String, rate: Double)

object SubscriberRate {
  implicit def csv: CSVEncoding[SubscriberRate] = ???
}

object Main {
  def main(args: Array[String]): Unit = {
    //        val x1 = UserDB.subscriber[Unlimited](x1)
    //        x1.rate(logs)
    Console.println("In main...")
    val inputPath = if (args.length == 1) args(0) else "in.csv"
    val outputPath = if (args.length >= 2) args(1) else "out.csv"
    val linesIterator = readFileAsString(inputPath) //.filterNot { x => x.startsWith("#") }.foreach { println(_) }
    //    for (line <- linesIterator) yield readRecord(line)
    linesIterator.filterNot { x => x.startsWith("#") }.map { x => x.split(",") }
    val input = readFile[UserAction, CSVEncoding](inputPath)
    val output = rate(input)
    writeFile[SubscriberRate, CSVEncoding](outputPath)
  }

  def rate(log: Seq[UserAction]): Seq[SubscriberRate] = ???

  // here was UserAction instead of T
  def readFile[T](fname: String)(implicit ser: CSVEncoding[T]): Either[String, Seq[T]] = {
		  /*
    Try {
      for ((s, i) <- readFileAsString(fname).zipWithIndex.toSeq) yield {
        ser.decode(s) match {
          case Left(message) => throw new IllegalArgumentException("")
          case Right(line) => line
        }
      }
    }
		   */
    val s0: Either[String, Seq[T]] = Right(Seq())
    readFileAsString(fname).foldLeft(s0) { (state, line) =>
      for (seq <- state
    		  t = ser.decode(line)  
      ) yield {
    	  seq :+ t        
      }
    }
  }
  def writeFile[T, Encoding[_]](fname: String)(implicit ser: Encoding[UserAction]): Seq[T] = ???

  def readFileAsString(fname: String): Iterator[String] = {
    io.Source.fromFile(new File(fname)).getLines()
  }

  def readRecords(lineIterator: Iterator[String]) = {
    println("Reading line...")
    new String().split("")
    //    line filterNot { x => x.startsWith("#") }.map { x => x.split(",") }
  }
}