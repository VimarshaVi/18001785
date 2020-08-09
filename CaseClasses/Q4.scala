case class Point(a:Int,b:Int){
	def x:Int = a
	def y:Int = b
	 
	def inverse = Point(y,x)
	
}

object MyApp extends App{
	val p1 = Point(3,7)
	
	println(p1)
	println("Inverse of point : "+p1.inverse)
}

