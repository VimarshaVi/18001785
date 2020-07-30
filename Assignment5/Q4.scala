class Account(id:String,Number:Int,balance:Double)
{
	var nic=id;
	var accNo=Number;
	var aBal=balance;
}

object RationalNeg
{
	def main(args:Array[String])
	{
		var a1=new Account("S123",1001,25000);
		var a2=new Account("S124",1002,10000);
		var a3=new Account("S125",1003,50000);
		var a4=new Account("S126",1004,-1000);
		var a5=new Account("S127",1005,-10000);
		var a6=new Account("S128",1006,0);
		val bank:List[Account]=List(a1,a2,a3,a4,a5,a6);
		
		print("Overdraft Account's numbers   : ");
		var Olist=overdrafting(bank);
		Olist.foreach(x=>print(x.accNo+"   "));

		
		var tBalance=balance(bank);
		print(tBalance.aBal);

		var interList=interest(bank);
		interList.foreach(x=>print(x+" "));

	}

	val overdrafting=(list:List[Account])=>list.filter(x=>x.aBal<=0);
	val balance=(list:List[Account])=>list.reduce((x,y)=>new Account("S000",1000,x.aBal+y.aBal));
	val interest=(list:List[Account])=>list.map(x=>(if(x.aBal>0) x.aBal*1.05d else x.aBal*1.01d));
}

