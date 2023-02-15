package oops;
class overload
{
	public void add(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	public void add(int a, int b, int c)// adding more arguments
	{
		int sum = a+b+c;
		System.out.println(sum);
	}
	public void add(int a , double b)// changing datatyppe
	{
		double ans = a*b;
		System.out.println(ans);
	}
	public void add(double a, int b)//reversing datatypte
	{
		double k = a-b;
		System.out.println(k);
	}
}
public class method_overloading {

	public static void main(String[] args) {
		overload ob = new overload();
		ob.add(70, 55.5);
		ob.add(5, 6);
		ob.add(55.2, 5);
		ob.add(4, 2, 3);
	}

}
