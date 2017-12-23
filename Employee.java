import java.util.Scanner;
class Employee
{
	String name;
	int id;
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of the employee");
		name=scan.nextLine();
		System.out.println("Enter the Id of the employee");
		id=scan.nextInt();
	}
}
class Regular extends Employee
{
	static double HRA,DA;
	double GS,BS;
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the base salary of the employee");
		BS=scan.nextDouble();
		System.out.println("Enter the HRA of the employee");
		HRA=scan.nextDouble();
		System.out.println("Enter the DA of the employee");
		DA=scan.nextDouble();
	}
	void display()
	{
		GS=BS+HRA+DA;
		System.out.println("Gross salary  the regular employee"+GS);
	}
}

class Part_Time extends Employee
{
	double hrs;
	static final double pay=1200.0;
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the hours of the part time employee");
		hrs=scan.nextDouble();
	}
	void display()
	{
		GS=pay*hrs;
		System.out.println("Gross salary  the part time employee"+GS);
	}
}
class testing
{
	public static void main(String args[])
	{
		Employee obj1=new Employee();
		obj1.input();
		
		
		Regular obj2=new Regular();
		obj2.input();
		obj2.display();
	
		Part_Time obj=new Part_Time();
		obj.input();
		obj.display();
	}
}
		




