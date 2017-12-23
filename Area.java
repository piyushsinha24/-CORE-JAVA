import java.util.Scanner;
class Area
{
	static double areaOfCircle(double r)
	{
		return 3.14*r*r;
	}
	static double areaOfCylinder(double r,double h)
	{
		return 2*3.14*r*(r+h);
	}
	public static void main(String args[])
	{
		double rcircle,rcylinder,h;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		rcircle=scan.nextDouble();
		System.out.println("Enter radius of cylinder");
		rcylinder=scan.nextDouble();
		System.out.println("Enter height of cylinder");
		h=scan.nextDouble();
		Area obj=new Area();
		double acircle=obj.areaOfCircle(rcircle);
		double acylinder=obj.areaOfCylinder(rcylinder,h);
		System.out.println("Area of circle="+acircle);
		System.out.println("Area of cylinder="+acylinder);
	}
}
