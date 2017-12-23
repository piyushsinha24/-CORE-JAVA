class test
{
	int num;//instance variable
	test(int num)
	{
		this.num=num;
	}
	int getReverse(int n)
	{
		int reverse = 0;
		while(n != 0)
		{
			reverse = (reverse*10)+(n%10);
			n = n/10;
		}
		return reverse;
			
	}

	public static void main(String args[])
	{
		test obj=new test(123);
		int rev=obj.getReverse(obj.num);
		System.out.println("Reversed number="+rev);
	}
}
