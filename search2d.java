import java.util.Scanner;
class search2d
{
	public static void main(String args[])
	{
		int i,j,flag=0,r=0,c=0;
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
		System.out.println("enter the key to be searched");
		int key=scan.nextInt();
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(key==a[i][j])
				{
					flag=1;
					r=i+1;
					c=i+1;
					break;
				}
			}
		}
		if(flag==0)
			System.out.println("Search UNsuccessful");
		if(flag==1)
		{
			System.out.println("Search successful, element found at row and column:"+r);
			System.out.print(c);
		}
			
		
		
		
	}
		
		
	
}

		
