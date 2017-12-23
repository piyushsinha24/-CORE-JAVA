import java.util.Scanner;
class student
{
	
	String name;
	int roll;
}
class marks extends student
{
	int phy,chem,maths;
	
}
class result extends marks
{
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter name");
		name=scan.nextLine();
		System.out.println("enter roll");
		roll=scan.nextInt();
		System.out.println("enter phy");
		phy=scan.nextInt();
		System.out.println("enter chem");
		chem=scan.nextInt();
		System.out.println("enter maths");
		maths=scan.nextInt();
		
		
	}
	
	void display()
	{
	System.out.println("Name="+name);
	System.out.println("roll="+roll);
	System.out.println("phy="+phy);
	System.out.println("chem="+chem);
	System.out.println("maths="+maths);
	}
}
class demo
{
	public static void main(String args[])
	{
		
		result obj=new result();
		obj.input();
		obj.display();
	}
}
