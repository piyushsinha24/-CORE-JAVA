import java.util.Scanner;
class vowel_words
{
	public static void main(String args[])
	{	
		int i=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		String []arr=str.split(" ");
		for(i=0;i<arr.length;i++)
		{
			if(arr[i].charAt(0)=='a'||arr[i].charAt(0)=='A'||arr[i].charAt(0)=='e'||arr[i].charAt(0)=='E'||arr[i].charAt(0)=='i'||arr[i].charAt(0)=='I'||arr[i].charAt(0)=='o'||arr[i].charAt(0)=='O'||arr[i].charAt(0)=='u'||arr[i].charAt(0)=='U')
				System.out.println(arr[i]);
		}
	}
}
