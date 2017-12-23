import java.util.Random;
class random
{
	public static void main(String args[])
	{
		//int max =100;
		int min =50;
		Random randomNum=new Random();
		for(int i=0;i<5;i++)
		{
			int show=min+randomNum.nextInt(50);
			System.out.println(show);
		}
	}
}
