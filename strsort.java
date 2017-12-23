import java.util.Scanner;
class strsort
{
	static void sort(String [] arr)
	{
		String temp="\0";
		int i,j;
		for(i=0;i<9;i++)
		{
			for(j=0;j<(9-i);j++)
			{
				if(arr[i].compareTo(arr[i+1])>0)
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		for(i=0;i<10;i++)
		 System.out.println(arr[i]);
				
	}
	
	static void search(String [] arr)
	{	
		Scanner scan=new Scanner(System.in);
		int i,pos=0,flag=0;
		System.out.println("Enter name to be searched");
		String str=scan.nextLine();
		for(i=0;i<10;i++)
		{
			if(str.equals(arr[i])==true)
			{
				pos=i;
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("search successful,name found at index ="+pos);
		if(flag==0)
			System.out.println("search unsuccessful");
	}
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		int i,j;
		String []arr=new String[10];
		System.out.println("Enter 10 names");
		for(i=0;i<10;i++)
			arr[i]=scn.nextLine();
		System.out.println("******Enter your choice******");
		System.out.println("Press 1 for sorting operation");
		System.out.println("Press 2 for searching operation");
		int ch=scn.nextInt();
		switch(ch)
		{
			case 1:
				sort(arr);
				break;
			case 2: 
				search(arr);
				break;
			default:
				System.out.println("Wrong choice");
				break;
		}
	}
}
		 
			
