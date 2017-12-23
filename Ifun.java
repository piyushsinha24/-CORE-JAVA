interface Ifun
{
	void talk();
	
}
interface Ifun2
{
	void talk();
}
class frog implements Ifun,Ifun2
{
	public void talk()
	{
		System.out.println("I am frog....");
	}
}
 class demo
{
	public static void main(String args[])
	{
		frog obj=new frog();
		obj.talk();
	}
}
