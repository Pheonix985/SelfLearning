val daysOfWeekList = List("Mon", "Tues", "Wed", "Thus", "Fri", "Sat", "Sun")
for (day <- daysOfWeekList) {
  day match {
    case "Mon" => println("Manic Monday ")
    case otherDay => println(otherDay)
  }
}

val x = for (day <- daysOfWeekList) yield {
  day match {
    case "Mon" => ("Manic Monday ")
    case otherDay => (otherDay)

  }
}


for (day <- daysOfWeekList) {
  println(day)
}

var a = 0
while (a < daysOfWeekList.size) {
  println(daysOfWeekList(a))
  a += 1
}

//PATTER MATCHING
val dayOfWeek = "Monday"
val typeOfDay = dayOfWeek match {
  case "Monday" => "Manic Monday"
  case "Sunday" => "Sleepy Sunday"

}


val dayOfWeek2 = "Saturday"
val typeOfDay2 = dayOfWeek2 match {
  case "Monday" => "Manic Monday "
  case "Saturday" | "Sunday" => "Lazy Weekend"
  case "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Other Working Day "
}


val dayOfWeek3 = "Friday"
val typeOfDay3 = dayOfWeek3 match {
  case "Monday" => "Manic Monday "
  case "Sunday" => "Lazy Weekend"
  case someOtherDay => {
    println(s"some other day - neither Sunday or Monday its $someOtherDay")

  }
}

val dayOfWeek4 = "Friday1"
val typeOfDay4 = dayOfWeek4 match {
  case "Monday" => "Manic Monday "
  case "Sunday" => "Lazy Weekend"
  case _ => {
    val errorString = s"some other day - neither Sunday or Monday its $dayOfWeek4"
      println(errorString)
    dayOfWeek4
  }
}
