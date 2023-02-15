package oops;
class animal
{
	String name;
	public void action()
	{
		System.out.println(name);
	}
}
	class mouse extends animal
	{
		public void display() 
		{
			System.out.println(name);
		}
	}
  


public class singleinheritance {

	public static void main(String[] args) {
		mouse ob = new mouse ();
		ob.name = "raju";
		ob.display();
		
  
	}

}
