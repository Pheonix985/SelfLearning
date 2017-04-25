
val name = "Henry"
val Greeting = "Good Day"

s"$Greeting $name, I hope u had a good day"

var radius = 10

val area = {
  val PI = 3.1
    println(s"inside scope 1, PI= $PI");
  {
    val PI = 3.14
    println(s"inside scope 2, PI= $PI")
    PI*radius*radius
  }

// PI*radius*radius

}
println(area)


//IF else expressions

var numer:Double = 22

var denom:Double = 7

var PI = if(denom != 0 ) {numer/denom} else {None}




var numer2:Double = 22
var denom2:Double = 0

var PI2 = if(denom2 != 0 ) {numer2/denom2} else {None}

//for looop


val daysOfWeekList = List("Mon","Tues","Wed","Thur","Fri","Sat","Sun")
for (day <- daysOfWeekList)
  {
    day match{
      case "Mon" => println("Another manic Monday ")
      case otherDay => println(otherDay)

    }
  }


val x = for(day <- daysOfWeekList) yield

{
  day match{
    case "Mon" => "Another manic Monday "
    case otherDay => otherDay

  }
}


for (day <- daysOfWeekList){
  println(day)

}





