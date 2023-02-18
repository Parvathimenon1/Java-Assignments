package methodprgm;

public class sum_naturalnumbers {

	public static void main(String[] args) {
		sum_naturalnumbers ob = new sum_naturalnumbers();
		int k = ob.sum1();
		System.out.println(k);

	}
public int sum1(){
	

int n = 10;
int sum = 0;
int i ;
for (i=0;i<=10;i++)
{
	sum = sum+i;
	
}
return sum;
}
}