package oops;
class datamembers
{
	String name;
	int age;
	int phonenumber;
	String address;
	int salary;
	public void data()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(phonenumber);
		System.out.println(address);
		System.out.println(salary);
		
	}
	
}
class employee extends datamembers
{
	String department;
	
}
class manager extends datamembers
{
	String specialisation;
	public void spec()
	{
		System.out.println(specialisation);
	}
}
public class member {

	public static void main(String[] args) {
		employee ob = new employee();
		manager os = new manager();
		ob.name = "paru";
		ob.age = 24;
		ob.phonenumber = 12345;
		ob.address = "kakak";
		ob.salary= 20000;
		ob.data();
		System.out.println(ob.department = "electrical");
		os.name = "paru";
		os.age = 24;
		os.phonenumber = 12345;
		os.address = "kakak";
		os.salary= 20000;
		os.data();
		System.out.println(os.specialisation = "power");
		
		
		
        
	}

}
