import java.util.Scanner;
class circle
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius");
		double r =scan.nextDouble();
		double area= 3.14*r*r;
		System.out.println("Area of the circle="+area);
	}
				
}
