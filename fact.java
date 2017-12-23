import java.util.Scanner;
class fact
{
	public static void main(String args[])
	{
		int i,fact=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan.nextInt();
		for(i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}
}














