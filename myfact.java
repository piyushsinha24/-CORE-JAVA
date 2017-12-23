class  myfact
{
	public synchronized int getFact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			try{
				Thread.sleep(200);
			}catch(Exception e){}
			System.out.println(fact*i);
			fact*=i;
		}
		return fact;
	}
}
class myfactprocess extends Thread
{
	myfact mf;
	int num;
	myfactprocess(myfact mf,int num)
	{
		this.mf=mf;
		this.num=num;
	}
	
	public void run()
	{
		int f=mf.getFact(num);
		System.out.println(" Factorial of num " +f);
		
	}
}
class Main
{
	public static void main(String args[])throws Exception{
	{
		myfact m=new myfact();
		myfactprocess mf1=new myfactprocess(m,5);
		myfactprocess mf2=new myfactprocess(m,6);
		myfactprocess mf3=new myfactprocess(m,7);
		mf1.start();
		mf1.join();
		mf2.start();
		mf2.join();
		mf3.start();
		mf3.join();
		}
	}
	
}
