import java.util.Scanner;
import java.lang.*;
class calculator
{
	double a,b;
	double addition()
	{
	 
	 double add = a+b;
	 return add;
	
	}
	double substraction()
	{
	
	 double sub = a-b;
	 return sub;
	
	}
	double multiply()
	{
	
	 double mult = a*b;
	 return mult;
	 
	}
	double divide()
	{
	
	 double div = a/b;
	 return div;
	 
	}
	

}
class cals extends calculator
{
	double x;
	double sine()
	{
	 double sine =Math.sin(x);
	 return sine;
	 }
	double cosine()
	{
	 double cosine =Math.cos(x);
	 return cosine;
	}
	
}
class democal extends cals
{
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a");
		a=scan.nextDouble();
		System.out.println("Enter b");
		b=scan.nextDouble();
		System.out.println("Enter angle in radians");
		x=scan.nextDouble();
	}
	void display()
	{
		  System.out.println("Sum="+addition());
		  System.out.println("Diff="+substraction());
		  System.out.println("Mult="+multiply());
		  System.out.println("div="+divide());
		  System.out.println(" sine ="+sine());
		  System.out.println(" cosine ="+cosine());
	}
}
class demo
{
 public static void main(String args[])
 {
 	democal obj=new democal();
 	obj.input();
 	obj.display();
 }
	}


