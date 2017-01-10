package example

case class UserAction (
  timestamp:     Long,
  subsciberId:   Long,
  action:        String, // SMS | Voice
  tariffZone:    Long,
  duration:      Long,
  sizeOfFile:    Long
)

object UserAction {
  implicit val x: CSVEncoding[UserAction] = ???
}
    
