import java.util.Scanner;
class add2d
{
	public static void main(String args[])
	{
		int i,j,sum=0;
		Scanner scan = new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter the elements");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=scan.nextInt();
				sum+=a[i][j];
			}
		}
		System.out.println("Matrix inserted:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("sum="+sum);
		
	}
		
		
	
}

		
