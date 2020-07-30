object RationalNeg
{
	def main(args:Array[String])
	{
		var a1=new Account("S123",1000,25000);
		var a2=new Account("S124",1001,10000);
           var a3=new Account("S125",0,0);
		val b:List[Account]=List(a1,a2,a3);
		
		val y=find(1001,b);
		a1.transfer(y,10000);

		println(a1.aBal);
		println(y.head.aBal);
		
	}

	val find=(accNo:Int,list:List[Account])=>list.filter(x=>x.accNo.equals(accNo));

}


class Account(id:String,Number:Int,balance:Double)
{
	var nic=id;
	var accNo=Number;
	var aBal=balance;

	def withdraw(amount:Double)=if(aBal>amount) aBal=aBal-amount else println("Your account balnce is not enough.");
	def deposit(amount:Double)=aBal=aBal+amount;
	def transfer(acc:List[Account],amount:Double)=
	{
		if(aBal>amount)
		{
			aBal=aBal-amount;
			acc.head.aBal=acc.head.aBal+amount;
		}
		else
		{
			println("Your account balnce is not enough.");
		}
	}	
}

