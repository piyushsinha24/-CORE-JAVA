import java.util.Scanner;
class smaller
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two no.s to be compared");
		int a =scan.nextInt();
		int b =scan.nextInt();
		int res = (a<b)?a:b;
		System.out.println("Smallers value ="+res);
	}
				
}
