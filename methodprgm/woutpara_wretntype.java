package methodprgm;

public class woutpara_wretntype {

	public static void main(String[] args) {
	
		woutpara_wretntype ob = new woutpara_wretntype();
		int k =ob.mul();
		System.out.println(k);
		
		
	}
//without parameter and with return type
	public int mul() 
	{
		int a= 40;
		int b = 2;
		int m;
		m = a*b;
		return m; 
	}
}
