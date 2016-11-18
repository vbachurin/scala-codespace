object Imports {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet")

  case class Person(firstName: String, lastName: String);$skip(182); 
  //case class PersonWithSurname(f: String, l:String, s: String) extends Person(f, l)

  val person = Person("Jon", "Gald");System.out.println("""person  : Imports.Person = """ + $show(person ));$skip(71); val res$0 = 

  person match {
    case Person("Jon", "Gald") => "Who are you?"
  };System.out.println("""res0: String = """ + $show(res$0));$skip(31); 
  
  val p1 = Person("A", "B");System.out.println("""p1  : Imports.Person = """ + $show(p1 ));$skip(28); 
  val p2 = Person("A", "B");System.out.println("""p2  : Imports.Person = """ + $show(p2 ));$skip(14); val res$1 = 
  
  p1 == p2;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(11); val res$2 = 
  p1 eq p2;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(39); 
  
  val p3 = p2.copy(firstName = "C");System.out.println("""p3  : Imports.Person = """ + $show(p3 ));$skip(117); 


	def hi(p: Person):String = {
		p match {
		case Person("a", b) => "AAA"
			case Person(a, b) => s"Hi ${a}"
		}
	};System.out.println("""hi: (p: Imports.Person)String""");$skip(26); val res$3 = 
	
  hi(Person("a", "b"));System.out.println("""res3: String = """ + $show(res$3))}
}
