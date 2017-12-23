import java.util.Scanner;
class zigzag
{
	public static void main(String args[])
	{
		int[][] marks=new int[4][];
		marks[0]=new int[]{11,22,33,44,55};
		marks[1]=new int[]{11,22,33,44};
		marks[2]=new int[]{11,22,33};
		marks[3]=new int[]{11,22};
		for(int [] a1:marks)
			{
				for(int x:a1)
				{
				System.out.print(x+"\t");
				}
			System.out.println();
			}
	}
}
