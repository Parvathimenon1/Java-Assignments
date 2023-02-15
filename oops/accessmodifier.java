package oops;

class modifier
{
	protected void div() //can access inside the class and outside the class (#) and in outise
	// the package using inheritance (called in staticfinal )
	{
		System.out.println("div");
		}
	
	private void add()//only can access inside this class
	{
		System.out.println("add");
	}

	
}

public class accessmodifier {

	public static void main(String[] args) {
		modifier ob = new modifier();
		ob.div();  //(#)
		
		

	}

}
