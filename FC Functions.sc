//nested Methods
val radius = 10.0
def getCircleStats(r:Double)={
  val PI = 3.14
  def getCircleArea(r:Double)= {PI * r * r}
  def getCircleCircumfrence(r:Double) = {2*PI * r}
  (getCircleArea(r),getCircleCircumfrence(r))
  }
getCircleStats(10)


def compareStringsASC(s1:String, s2:String):Int= {
  if(s1==s2)0
  else if(s1>s2)1
  else {-1}

}

compareStringsASC("abc","abc")
compareStringsASC("abc","efg")
compareStringsASC("efg","abc")



def compareStringsDes(s1:String, s2:String)= {
  if(s1==s2)0
  else if(s1>s2){-1}
  else {1}

}
compareStringsDes("abc","abc")
compareStringsDes("abc","efg")
compareStringsDes("efg","abc")

//Higher Level Function
def smartCompare(s1:String, s2:String, cmpfn:(String,String)=>Int):Int = {
  cmpfn(s1, s2)
}

smartCompare("abc","efg",compareStringsASC)
smartCompare("abc","efg",compareStringsDes)


def getComparator(result:Boolean):(String,String)=>Int = {
  if(result== true) compareStringsDes
  else compareStringsASC
}

val compObject = getComparator(true)

compObject("efg","abc")

val compObject2 = getComparator(false)

compObject2("efg","abc")

val defaultCompare = smartCompare(_:String,_:String,compareStringsASC)
