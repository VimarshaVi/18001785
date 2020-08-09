object MyApp extends App{
  
  val p1=Point(2,3)
  val p2=Point(2,3)
  val p3=p1.move(2,3)
  val p4=p1.copy(a=5);


  println(p1)
  println(p2)
  println(p1+p2)

}

case class Point(a:Int,b:Int){

  def x:Int=a
  def y:Int=b

 def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
 def +(that:Point)=Point(this.x+that.x,this.y+that.y)

}




