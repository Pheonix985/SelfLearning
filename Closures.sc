def getAreaClosure = {
  val PI = 3.14
  val getArea = (radius: Double) => {
    PI*radius*radius

  }:Double
  getArea
}
val PI = 3.1
val r = 10

val areaCalc: Double => Double = getAreaClosure

println(areaCalc(r))
