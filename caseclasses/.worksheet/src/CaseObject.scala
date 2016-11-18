object CaseObject {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  println("Welcome to the Scala worksheet")

  sealed trait IntList

  case class Cons(head: Int, tail: IntList) extends IntList
  case object IntNil extends IntList
  case object OtherNil extends IntList;$skip(298); 

  //Cons(3, IntNil)
	
  def len(x: IntList): Int = {
    x match {
      case Cons(a, t) => 1 + len(t)
      case IntNil => 0
    }
  };System.out.println("""len: (x: CaseObject.IntList)Int""");$skip(26); val res$0 = 
  
	len(Cons(3, IntNil));System.out.println("""res0: Int = """ + $show(res$0));$skip(25); val res$1 = 
	len(Cons(30, OtherNil));System.out.println("""res1: Int = """ + $show(res$1))}
	
}
