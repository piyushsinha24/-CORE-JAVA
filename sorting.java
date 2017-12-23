import java.util.Scanner;
class sort
{
	public static void main(String args[])
	{
		int i,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of  elements");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Sorted :"+a[i]);
		}
	}
}
		
