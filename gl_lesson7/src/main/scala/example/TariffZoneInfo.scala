package example

class TariffZoneInfo {
  def baseMinuteCost(tariffZoneId: Long): Either[String, Double] = ???
  
  def baseSMSCost(tariffZoneId: Long): Either[String, Double] = ???
}