package com.gl

object FuncOp3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet")}
}

sealed trait MyIntList {
	def map(f:Int => Int):MyIntList = {
		this match {
			case Cons(head,tail) => Cons(f(head), tail map f)
			case MyNil => MyNil
		}
	}
}

case class Cons(head: Int, tail: MyIntList) extends MyIntList

case object MyNil extends MyIntList
