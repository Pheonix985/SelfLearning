val weekdays = List("Mon","Tues","Wed","Thurs","Fri")
val weekint = List(1,2,3,5,6,3,1,1,1,1)

weekdays.foreach(println(_))

weekdays.map(_=="Mon")


val isManicMon = (x:String)=> {x == "Mon"}:Boolean


val isManicInt = (x:Int)=> {x == 1}:Boolean

weekdays.map(isManicMon)

weekint.map(isManicInt)

weekdays.filter(isManicMon)

weekdays.partition(isManicMon)

weekdays.sortBy(_(0))

//scans
val SM = List(10,20,30,40,50,60)

SM.scanRight(0)(_-_)


//Reduce
SM.reduceRight(_-_)

SM.reduceLeft(_-_)




