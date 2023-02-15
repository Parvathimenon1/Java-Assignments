package oops;

public class classvariables {
	String name;
	int id;
	int salary;
	
	public void display()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
		
	}

	public static void main(String[] args) {
		classvariables ob = new classvariables();
		ob.name = "paru";
		ob.id= 123;
		ob.salary = 20000;
		ob.display();

	}

}
