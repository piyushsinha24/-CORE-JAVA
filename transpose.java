import java.util.Scanner;
class transpose
{
	public static void main(String args[])
	{
		int i,j,flag=0,pos=0;
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
		System.out.println("Transpose matrix :");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t"+a[j][i]);
			}
			System.out.println();
		}
		
		
	}
}

		
