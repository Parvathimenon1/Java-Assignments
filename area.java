package methodprgm;

public class area {

	public static void main(String[] args) {
	
		//trianle (without para and with return
		
		area ob = new area ();
		area x = new area();
		area y = new area();
		ob.sqarea(6);
        int j=x.recarea(4,2);
        System.out.println(j);
        double s = y.triarea();
        System.out.println(s);
        
	}
	// area of square(with para and without reuurn
public void sqarea(int a)
{
	int areasqr = a*a;
	System.out.println(areasqr);
}
//rec(with para and with return)
public int recarea(int b,int c)
{
	int rectanarea = b*c;
	
	return rectanarea;
}
//triangle(without para and with return)
public double triarea()
{
	int d = 3;
	int e = 9;
	double trianglearea = 0.5 * d * e;
	return trianglearea;
}
}
