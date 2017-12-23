class mythread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("Hi");
	}
}
class mythread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("Hello");
	}
}
class threading
{
	public static void main(String args[])
	{
		mythread1 mt1=new mythread1();
		mythread2 mt2=new mythread2();
		mt1.start();mt2.start();
	}
}
