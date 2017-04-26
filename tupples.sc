val genderPair = "Henry" -> "M"
genderPair.productIterator.foreach{i => println("Value = " + i )}

val (name,gen) = genderPair
genderPair._1
genderPair._2



genderPair.productArity

//lists

val weekendDays2 = List("Sat","Sun")

val weekDays2 = List("Mon","Tues","Wed","Thurs","Fri")

val Days = weekDays2 ::: weekendDays2

val Days2 = weekDays2 ++ weekendDays2

val dayIndices = List(1,2,3,4,5,6,7)

dayIndices zip dayIndices

weekDays2.head
weekDays2.tail
weekDays2.size
weekDays2.reverse
weekDays2(1)
weekDays2.contains("Mon")
weekDays2.contains("sun")

for (c <- weekDays2) println(c)




//Maps (Key Value pairs)

val stateCodes = Map(
  "California" -> "CA",
  "New York" -> "NY",
  ("vermont","VT")
  )
stateCodes("California")

stateCodes.contains("California")

stateCodes.foreach(A => println(A._1 + " = " + A._2))

val states = List ("California","New York","Vermont")
val codes = List("CA","NY","VT")

val stateCodes2 = (states zip codes).toMap

val states2 = stateCodes2.keySet.toList

val codes2 = stateCodes2.values.toList

//Options

def fraction(number:Double,denom:Double): Option[Double] = {
  if (denom == 0)
    None
  else
    Option(number/denom)
}

fraction(22,7)

fraction(22,0)


fraction(12,10) getOrElse "Sorry, There was a Mistake"



fraction(12,0) getOrElse "Sorry, There was a Mistake"



fraction(12,8)  match {

  case Some(pi) => pi
  case None => "Error"

}


fraction(12,0)  match {

  case Some(pi) => pi
  case None => "Error cannot divide by 0"


}





val stateCode = util.Try(stateCodes("NotHere"))
stateCode match {
  case util.Success(code) => code
  case util.Failure(error) => "Something went wrong"

}





val somenumbers = collection.mutable.Buffer(10,20,30,40,50,60)






























