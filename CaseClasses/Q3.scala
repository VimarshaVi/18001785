import math.{ sqrt, pow }
case class Point(x:Double,y:Double){

def distance(other: Point): Double = sqrt(pow(x - other.x, 2) + pow(y - other.y, 2))
override def toString = "("+x+","+y+")"
}

object MyApp extends App{
val a1= Point(3,3)
val a2= Point(5,4)
val a3= a1.distance(a2)
println(a1)
println(a2)
println(a3)

}
