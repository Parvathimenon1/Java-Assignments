package methodprgm;

import java.util.Scanner;

public class palliendrome {

	public static void main(String[] args) {
	 int n,p=0,temp;
	 temp = a;
	 System.out.println("eneter the number");
	 Scanner ob = new Scanner(System.in);
	int a = ob.nextInt();
	 while(a>0)
	 {
		 n  = a%10;
	     p = (p*10)+n;
		 a = a/10;
	 }	 
	 
	 System.out.println(p);
 
if( temp == p)
 {
	 System.out.println("palliendrome");
 }
 
	}
	
}
