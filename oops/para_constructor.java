package oops;

public class para_constructor {
	int emoid;
	String empname;
	int empsalary;
	public para_constructor(int id,String name, int salary)
	{
		emoid = id;
		empname = name;
		empsalary = salary;
		
	}
public void display()
{
	System.out.println(empname);
	 System.out.println(emoid);
	 System.out.println(empsalary);
	 
}
	public static void main(String[] args) {
		para_constructor ob = new para_constructor(1,"paru",20000);
		
		ob.display();

	}

}
