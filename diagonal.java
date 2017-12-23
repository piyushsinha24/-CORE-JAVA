import java.util.Scanner;
class diagonal
{
	public static void main(String args[])
	{
		int i,j;
		Scanner scan = new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter the elements");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=scan.nextInt();
				
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
		int sum=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(a[i][j]==a[j][i])
				{
					sum=sum+a[i][j];
				}
			}
		}
		
			System.out.println("diagonal sum"+sum);
		
		
		
		
	}
		
		
	
}

		
