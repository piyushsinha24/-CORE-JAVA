class Bankcust
{
	int amt=1000;
	public synchronized void withdraw(int amt)
	{
		System.out.println("Withdraw process starts....");
		if(this.amt<amt)
			System.out.println("Less amount in A/C wait for deposit");
		try{
			wait();
		}catch(Exception e){}
		
		this.amt-=amt;
		System.out.println("Withdraw process complete");
	}
	
	public synchronized void deposit(int amt)
	{
		System.out.println("Deposit process starts....");
		this.amt+=amt;
		System.out.println("Deposit process complete");
		notify();
	}
}
class Main
{
	public static void main(String args[])throws Exception
	{
		final Bankcust bankc = new Bankcust();
		new Thread()
		{
			public  void run()
			{
				bankc.withdraw(10000);
			}
		}.start();
		new Thread(){
			public void run()
			{
				bankc.deposit(10000);
			}
		}.start();
		
	}
}


