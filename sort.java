class  sort
{
	public synchronized int[] getsort(int []arr)
	{
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
				 	arr[j]=arr[j]+arr[j+1];
				 	arr[j+1]=arr[j]-arr[j+1];
				 	arr[j]=arr[j]-arr[j+1];
				 }
				 
			}
		}
		
			try{
			Thread.sleep(200);
			}catch (Exception e){}
			return arr;
	}
}
class mysortprocess extends Thread
{
	sort ms;int i;
	int []arr=new int [5];
	mysortprocess(sort ms,int []arr)
	{
		this.ms=ms;
		this.arr=arr;
	}
	
	public void run()
	{
		int []s=new int [5];
		s=ms.getsort(arr);
		for(i=0;i<5;i++)
		System.out.println(s[i]);
		
	}
}
class func
{
	public static void main(String args[])throws Exception
	{
		sort m=new sort();
		mysortprocess ms1=new mysortprocess(m,new int[]{5,3,2,4,1});
		mysortprocess ms2=new mysortprocess(m,new int[]{5,6,2,4,1});
		mysortprocess ms3=new mysortprocess(m,new int[]{5,9,2,3,1});
		ms1.start();
		ms1.join();
		ms2.start();
		ms2.join();
		ms3.start();
		ms3.join();
		
	}
	
}

