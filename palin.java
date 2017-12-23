import java.util.Scanner;
class palin
{
	
	public static void main(String args[])
	{
		int i,j,flag=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a string");
		String str=scan.nextLine();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
			{
				flag=1;
				break;
			}
			
		}
		if(flag==0)
			System.out.println("Palindrome");
		else
			
			System.out.println(" Not Palindrome");
		
		
	}
}
