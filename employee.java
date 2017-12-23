class employee
{
	private int empid;
	private double empsal;
	private String empname;
	
	employee(int empid ,double empsal,String empname)
	{
		this.empid=empid;
		this.empsal=empsal;
		this.empname=empname;
	}
	
	
	void display()
	{
		System.out.println("Name is :" +empname);
		System.out.println("Id is :" +empid);
		System.out.println("salary is :" +empsal);
	}
		
	
}
class emptest
{
	public static void main(String[] arg)
	{
		employee obj=new employee(12,2000.0,"jai");
		//obj.employee(12,2000.0,"jai");
		obj.display();
		
	}
}
