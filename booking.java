import java.util.Scanner;
class booking
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int [][]arr=new int[5][4];
		int i,j,k=0,flag=0;
		double nrml,prime,gold,gst;
		nrml=240.0;prime=300.0;gold=400.0;
		for(i=0;i<5;i++)
		{
			for(j=0;j<4;j++)
			{
				arr[i][j]=++k;
			}
		}
		System.out.println("*****MOVIE BOOKING*****");
		System.out.println("*****TIGER ZINDA HAI*****");
		System.out.println("ACTORS :- SALMAN KHAN & KATRINA KAIF");
		System.out.println("DIRECTOR :- ALI ABBAS ZAFAR");
		System.out.println("RUN TIME :- 2HRS 41MINS");
		for(i=0;i<5;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
		for(;;)
		{
		System.out.println("Wanna book a seat(YES/NO)");
		String choice=scan.nextLine();
		if(choice.equals("YES")==true)
		{
			System.out.println("Enter the seat no.");
			int seat=scan.nextInt();
			for(i=0;i<5;i++)
			{
				for(j=0;j<4;j++)
				{
					if(arr[i][j]==seat)
					{
						arr[i][j]=0;
						flag=1;
						if(i==1)
						{
							System.out.println("Prime seats selected.");
							System.out.println("Price =Rs."+prime);
							gst=0.18*prime;
							System.out.println("GST(18%) =Rs."+gst);
							System.out.println("Total Price =Rs."+(prime+gst));
							
							
						}
						else if(i==0)
						{
							System.out.println("Gold seats selected.");
							System.out.println("Price =Rs."+gold);
							gst=0.18*gold;
							System.out.println("GST(18%) =Rs."+gst);
							System.out.println("Total Price =Rs."+(gold+gst));
							
						}
						else
						{
							System.out.println("Normal seats selected.");
							System.out.println("Price =Rs."+nrml);
							gst=0.18*nrml;
							System.out.println("GST(18%) =Rs."+gst);
							System.out.println("Total Price =Rs."+(nrml+gst));
						}
						
						break;
					}
				}
			}
			
			if(flag==1)
			{
				for(i=0;i<5;i++)
				{
					for(j=0;j<4;j++)
					{

							if(arr[i][j]==0)
								System.out.print("\tBK");	
							else
							System.out.print("\t"+arr[i][j]);
					}
					System.out.println();
				}
				System.out.println("BOOKING CONFIRMED");
				System.out.println("ENJOY THE MOVIE");
				
			}
			
			
				
		    }
		    else if(choice.equals("NO")==true)
			System.exit(0);
		    //else
		    	//System.out.println("Wrong instruction");
		}
		
		
	}
}
			
