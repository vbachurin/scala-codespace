object CaseObject {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  sealed trait IntList

  case class Cons(head: Int, tail: IntList) extends IntList
  case object IntNil extends IntList
  case object OtherNil extends IntList

  //Cons(3, IntNil)
	
  def len(x: IntList): Int = {
    x match {
      case Cons(a, t) => 1 + len(t)
      case IntNil => 0
    }
  }                                               //> len: (x: CaseObject.IntList)Int
  
	len(Cons(3, IntNil))                      //> res0: Int = 1
	len(Cons(30, OtherNil))                   //> scala.MatchError: OtherNil (of class CaseObject$$anonfun$main$1$OtherNil$2$)
                                                  //| 
                                                  //| 	at CaseObject$$anonfun$main$1.len$1(CaseObject.scala:13)
                                                  //| 	at CaseObject$$anonfun$main$1.len$1(CaseObject.scala:14)
                                                  //| 	at CaseObject$$anonfun$main$1.apply$mcV$sp(CaseObject.scala:20)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at CaseObject$.main(CaseObject.scala:1)
                                                  //| 	at CaseObject.main(CaseObject.scala)
	
}