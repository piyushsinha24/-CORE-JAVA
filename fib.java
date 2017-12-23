import java.util.Scanner;
class fib
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int n =scan.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(fibonacci(i));
		}
		
	}
	static int fibonacci(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else 
			return fibonacci(n-1)+fibonacci(n-2);
	}
				
}
