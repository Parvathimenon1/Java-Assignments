package oops;
class students
{
	String studentsname;
	public void display()
	{
		System.out.println("list");
		}
}
class divA extends students
{
	public void names()
	{
		System.out.println(studentsname);
	}
}
class attendance extends students
{
	public void list()
	{
		
	System.out.println("passed");
}
	
}

public class multilevel {

	public static void main(String[] args) {
		attendance ob = new attendance();
		ob.studentsname = "paru";
		ob.list();
		ob.display();
		

	}

}
