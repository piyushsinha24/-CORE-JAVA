import java.util.Scanner;
class swap
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two no.s to be swapped");
		int a =scan.nextInt();
		int b =scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a ="+a);
		System.out.println("value of b ="+b);
	}
				
}
