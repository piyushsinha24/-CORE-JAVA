import java.util.Scanner;
class catdog
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a sentence containing cats and dogs");
		String str=scan.nextLine();
		System.out.println("enter a cat's name");
		String cname=scan.nextLine();
		System.out.println("enter a dog's name");
		String dname=scan.nextLine();
		String s=str.replaceAll("cat",cname);
		String st=s.replaceAll("dog",dname);
		System.out.println(st);
	}
}
