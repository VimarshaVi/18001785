object RationalNeg extends App{
   val a= new Rational(1,2)
   println(a+".neg // evalutes to "+a.neg)
  
}

class Rational(x:Int,y:Int){
   def numer=x;
   def denom=y;
   
   def neg=new Rational(-this.numer,this.denom)
   override def toString= numer+"/"+denom
}
