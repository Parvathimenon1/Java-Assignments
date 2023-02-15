package oops;
abstract class A
{
	public void add()
	{
		System.out.println("add");
	}
	abstract public void div();
	
}
class b extends  A
{
	@Override
	public void div() // we have to override for inheritance

	{
		System.out.println("DIV");
	}
}
public class abstraction {

	public static void main(String[] args) {
		

	}

}
