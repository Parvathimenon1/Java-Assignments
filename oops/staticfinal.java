package oops;

public class staticfinal extends modifier //(#)
{
    static String interest = "5%"; // initialised a static variable
    final int accountnumber = 50000; // initialised a final variable
    
    
    
    
	public static void main(String[] args) {
		staticfinal ob = new staticfinal();
		ob.div();  //(#)
		  
		System.out.println(interest);//no need of object for static variable
		System.out.println(ob.accountnumber);
		System.out.println(interest = "65%");
		

	}

}
