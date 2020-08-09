object MyApp extends App{
  
  val p1=Point(2,0)
  val p2=Point(2,3)
  val p3=p1.move(2,3)
  val p4=p1.copy(a=5);
  val printInfo=(p:Point)=>p match{
    case Point(0,0)=>println("Point Origin")
    case Point(_,0)=>println("Point on X axis")
    case Point(0,_)=>println("Point on Y axis")
    case _=>println(p)
  }


  println(p1)
  printInfo(p1)
  
}

case class Point(a:Int,b:Int){

  def x:Int=a
  def y:Int=b

 def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
 def +(that:Point)=Point(this.x+that.x,this.y+that.y)

}
