import java.util.Scanner;
class addsub
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two no.s to be added/subtracted without using operators");
		int a =scan.nextInt();
		int b =scan.nextInt();
		int x=a;
		int y=b;
		int i;
		for(i=0;i<y;i++)
			x++;
		System.out.println("Sum ="+x);
		
		for(i=0;i<b;i++)
			a--;
		System.out.println("Difference ="+a);
	
		
	}
			
				
}
