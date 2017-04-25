val getArea = (radius: Double) =>
  {
  val PI = 3.14;
  PI * radius * radius
  }:Double

def getArea2(radius:Double):Double = {
  val PI = 3.14
  PI * radius * radius
}

getArea(10)
getArea2(10)


val PI = 3.14
val r = 10

def getCircleArea(r:Double):Double = {PI*r*r}



val calCircleArea2:Double => Double = getCircleArea

println("herllo")

calCircleArea2(r)


val calCircleArea3 = getCircleArea _

calCircleArea3(r)

