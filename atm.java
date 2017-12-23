 import java.util.Scanner;
class atm
{	
	static int bal=10000;
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String cardno;int pin;
		System.out.println("Enter your 16 digit card no.");
		cardno = scan.nextLine();
		System.out.println("Enter your pin no.");
		pin = scan.nextInt();
		int res=isvalid(cardno,pin);
		if(res==0)
			{
			System.out.println("Not valid user");
			System.out.println("Transaction Declined");
			}
		if(res==1)
		{
		System.out.println("Valid Credentials,Hello Sir!!!");
		System.out.println("***ATM***");
		System.out.println("Press 1 Withdraw");
		System.out.println("Press 2 Mini statement");
		System.out.println("Press 3 to exit ");
		int ch=scan.nextInt();
		switch(ch)
		{
			case 1:
			    	bal=withdraw(bal);
			    	System.out.println("Available balance = Rs."+bal);
			    	break;
			case 2:
				//statement();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");
				break;
		}
		}
	}
	static int isvalid(String cardno,int pin)
	{
		final String cno="1234567890123456";final int pn=2020;
		if(cardno.equals(cno)==true&&pin==pn)
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
}
				
			
		
