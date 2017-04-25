def getAreaClosure = {
  val PI = 3.14
  val getArea = (radius: Double) => {
    PI*radius*radius

  }:Double
  getArea
}
getAreaClosure

val areaCalculator: Double => Double = getAreaClosure

val r = 10

println(getAreaClosure(r))


