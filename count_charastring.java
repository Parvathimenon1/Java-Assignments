package methodprgm;

import java.util.Scanner;

public class count_charastring {

	public static void main(String[] args) {
		count_charastring os = new count_charastring();
		int k = os.count1();
		System.out.println(k);
	}
public int count1() {
	String n;
	System.out.println("enter the string");
	Scanner ob = new Scanner(System.in);
	n = ob.next();
	int count = n.length();
	return count;
	
	
}
}
