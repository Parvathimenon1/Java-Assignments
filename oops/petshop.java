package oops;



interface animal_details
{
	public void catdetails(String catname, int catage, int catprice);
	public void dogdetails(String dogname, int dogage, int dogprice);
	public void fishdetails(String fishname, int fishage, int fishprice);	
}
class petmall implements animal_details
{

    
	@Override
	public void catdetails(String catname, int catage, int catprice) {
		System.out.println("name of cat is"+ catname);
		System.out.println("price of cat is"+ catage);
		System.out.println("age of cat is"+ catprice);
		
	}

	@Override
	public void dogdetails(String dogname, int dogage, int dogprice) {
		System.out.println("name of cat is"+ dogname);
		System.out.println("price of cat is"+ dogage);
		System.out.println("age of cat is"+ dogprice);
		
	}

	@Override
	public void fishdetails(String fishname, int fishage, int fishprice) {
		System.out.println("name of cat is"+ fishname);
		System.out.println("price of cat is"+ fishage);
		System.out.println("age of cat is"+ fishprice);
		
		
	}
	
}







public class petshop {

	public static void main(String[] args) {
		petmall ob = new petmall();
		ob.catdetails("kkk", 10, 1000);
	    ob.dogdetails("opo", 110, 888880);
        ob.fishdetails("ppp", 5, 10000);
	}

}
