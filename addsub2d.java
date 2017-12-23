import java.util.Scanner;
class addsub2d
{
	public static void main(String args[])
	{
		int i,j;
		Scanner scan = new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		System.out.println("Enter the elements for 1st array");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=scan.nextInt();
				
			}
		}
		System.out.println(" 1st Matrix inserted:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("Enter the elements for 2nd array");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=scan.nextInt();
				
			}
		}
		System.out.println(" 2nd Matrix inserted:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t"+b[i][j]);
			}
			System.out.println();
		}
		int sum[][]=new int[3][3];
		int diff[][]=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				
			}
		}
		System.out.println(" sum matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t"+sum[i][j]);
			}
			System.out.println();
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				diff[i][j]=a[i][j]-b[i][j];
				
			}
		}
		System.out.println(" diff matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t"+diff[i][j]);
			}
			System.out.println();
		}
		
		
	}
		
		
	
}

		
