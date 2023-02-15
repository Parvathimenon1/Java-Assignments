 package oops;

public class constructor {
 String name;
 int id;
 int salary;
 public constructor()//public classname
 {
	 name = "revathy";
	 id = 2001;
	 salary = 2000;
	 
 }
 public void display()
 {
	 System.out.println(name);
	 System.out.println(id);
	 System.out.println(salary);
	 
 }
	public static void main(String[] args) {
		constructor ob =  new constructor();
		System.out.println(ob.name);
		System.out.println(ob.id);
		System.out.println(ob. salary);
		

	}

}
