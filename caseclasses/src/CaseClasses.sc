object Imports {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  case class Person(firstName: String, lastName: String)
  //case class PersonWithSurname(f: String, l:String, s: String) extends Person(f, l)

  val person = Person("Jon", "Gald")              //> person  : Imports.Person = Person(Jon,Gald)

  person match {
    case Person("Jon", "Gald") => "Who are you?"
  }                                               //> res0: String = Who are you?
  
  val p1 = Person("A", "B")                       //> p1  : Imports.Person = Person(A,B)
  val p2 = Person("A", "B")                       //> p2  : Imports.Person = Person(A,B)
  
  p1 == p2                                        //> res1: Boolean = true
  p1 eq p2                                        //> res2: Boolean = false
  
  val p3 = p2.copy(firstName = "C")               //> p3  : Imports.Person = Person(C,B)


	def hi(p: Person):String = {
		p match {
		case Person("a", b) => "AAA"
			case Person(a, b) => s"Hi ${a}"
		}
	}                                         //> hi: (p: Imports.Person)String
	
  hi(Person("a", "b"))                            //> res3: String = AAA
}