class mythread1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getName()+"\tHi");
	}
}
class mythread2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getName()+"\tHello");
	}
}
class runnable
{
	public static void main(String args[])
	{
		mythread1 mt1=new mythread1();
		mythread2 mt2=new mythread2();
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		t1.setName("process 1");
		t2.setName("process 2");
		t1.start();t2.start();
	}
}
