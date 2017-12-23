import java.util.Scanner;
class search
{
	public static void main(String args[])
	{
		int i,j,flag=0,pos=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of  elements");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the key to be searched");
		int key=scan.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				pos=i;
				flag=1;
				break;
			}
	        }
	        if(flag==1)
	        	System.out.println("Search Successful, element found at index :"+pos);
	        if(flag==0)
	        	System.out.println("Search Unsuccessful");
	}
}

		
