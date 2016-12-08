package scala.codespace.ticktack

//TODO: pass to github
trait Game {

  val rules: Rules

  case class State(field:Field,a:Player,b:Player)
  {

    def endOfGame: Boolean = rules.isWin(field) != None

    def step():Either[String, State] =
    {
      if (endOfGame)
        Left("Game Over")
      else {
        for{(ijn, nextA) <- a.nextStep(field).right
              (i,j) = ij
              nextField <- field.put(i,j, a.label)
        } yield 
          State(nextField, b, nextA)
      }
        /*
        val (ij,nextA) = a.nextStep(field)
        if (rules.isCorrect(ij,field,a.label)) {
          field.put(ij._1, ij._2, a.label) match {
            case Left(message) => State(field, nextA.tell("Cell is busy"))
            case Right(nextField) => State(nextField, b, nextA)
          }
          State(nextField, b, nextA)
        }else{
          State(field,nextA.tell("Bad step"),b)
        }
      }
      */
    }



  }

  def play(a:Player,b:Player):Field = {
     var s = State(rules.emptyField,a,b)
     while(!s.endOfGame) {
       s = s.step() match {
         case Left(message) => s.a.tell(message)
                               s
         case Right(s1) => s1
       }
     }
     s.field
  }


}
