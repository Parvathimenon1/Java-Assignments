package oops;
//create a interface tv remote .use it to inherit other tv remote of smart tv.
//then create  a class tv which implements smart tv remotes

interface tv_remote
{
	public void on();
	public void off();
}

class smart_tv
{
	public void volup()
	{
		System.out.println("volumeup");
	}
	
}
class tv extends smart_tv implements tv_remote
{
	public void voldown()
	{
		System.out.println("volumeup");
	}

	@Override
	public void on() {
		System.out.println("tv on");
		
	}

	@Override
	public void off() {
		System.out.println("tv off");
		
	}
}





public class Interface {

	public static void main(String[] args) {
		tv ob = new tv();
		ob.off();
		ob.on();
		ob.volup();
		ob.voldown();
				
			
				
	}

}
