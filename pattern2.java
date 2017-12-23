import java.util.Scanner;  
public class pattern2
{
	public static void main(String args[]) 
	{
       		Scanner scan=new Scanner(System.in); 
		int n;
		System.out.println("Enter the number of rows. ");
		n=scan.nextInt();  
		char c;
		for(int i=1;i<=n;++i)        
		{
			c='A';
			for(int j=i;j<n;++j)        
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;++k)      
			{
				System.out.print(c);
				++c;
			}
			c-=2;
			for(int l=1;l<i;++l)      
			{
				System.out.print(c);
				--c;
			}
			System.out.println();    
		}

   	 }   

}

