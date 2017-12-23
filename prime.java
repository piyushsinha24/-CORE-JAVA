import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n =scan.nextInt();
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				flag=1;
		}
		if(flag==0)
			System.out.println("Prime no.");
		else
			System.out.println("Not Prime no.");
	}
				
}
