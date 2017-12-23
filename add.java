import java.util.Scanner;
class add
{
	public static void main(String args[])
	{
		int sum=0;
		int a[]=new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<5;i++)
		{
			a[i]=scan.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum of the elements ="+sum);
	}
}
		
