 import java.util.Scanner;
 import java.io.*;
class atm
{	
	static int bal=10000;
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String cardno,pin;
		System.out.println("Enter your 16 digit card no.");
		cardno = scan.nextLine();
		System.out.println("Enter your pin no.");
		pin = scan.nextLine();
		int res=isvalid(cardno,pin);
		if(res==0)
			{
			System.out.println("Not valid user");
			System.out.println("Transaction Declined");
			}
		if(res==1)
		{
		System.out.println("Valid Credentials,Hello Sir!!!");
		for(;;)
		{
		System.out.println("***ATM***");
		System.out.println("Press 1 Withdraw");
		System.out.println("Press 2 Deposit");
		System.out.println("Press 3 Mini statement");
		System.out.println("Press 4 to exit ");
		int ch=scan.nextInt();
		switch(ch)
		{
			case 1:
			    	bal=withdraw(bal);
			    	break;
			case 2:
				bal=deposit(bal);
				break;
			case 3:
				System.out.println("Mini Statement");
				System.out.println("Available balance = Rs."+bal);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");
				break;
		}
		}
	} }
	static int isvalid(String cardno,String pin)
	{
		String []a=new String[2];
		a=readfile();
		if(cardno.equals(a[0])==true&&pin.equals(a[1]))
			return 1;
		else
			return 0;
	}
	static int withdraw(int bal)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn");
		int amt=scn.nextInt();
		if(amt<=bal){
			bal=bal-amt;
			System.out.println("Transaction Success");
			}
		else
			{
			System.out.println("Not enough a/c balance");
			System.out.println("Transaction Declined");
			}
			
		return bal;
	}
	static int deposit(int bal)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the amount to be deposited");
		int amt=scn.nextInt();
		if(amt<=bal){
			bal=bal+amt;
			System.out.println("Transaction Success");
			}
		return bal;
	}
	static String[] readfile()
	{
		int i;
		String []arr=new String[2];
		try{
			
			Scanner sc=new Scanner(new File("atmfile.txt"));
			for(i=0;i<2;i++)
			{
				arr[i]=sc.nextLine();
			}
		}
		   catch(Exception e)
		   {
		   	System.out.println(e);
		   }
		return arr;
	}
}
				
			
		
