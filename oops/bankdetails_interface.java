package oops;

import java.util.Scanner;

interface bankdetails
{
	public void name();
	public void accountnum();
	public void deposit();
	public void balance();
	public void withdraw();
	
}
 class sbi implements bankdetails
 {
   static String name ;
   int accountnumber;
   Scanner sc = new Scanner(System.in);
   int balance = 10000;
   int deposit;
   
	
	@Override
	public void accountnum() {
		System.out.println("enetr the account number");
		accountnumber = sc.nextInt();
		System.out.println(accountnumber);
		
	}

	@Override
	public void deposit() {
		System.out.println("enetr the deposit amount");
		deposit = sc.nextInt();
		System.out.println(deposit);
		
		
	}

	@Override
	public void balance() {
		balance = balance + deposit;
				System.out.println(balance);
	}

	@Override
	public void withdraw() {
		System.out.println("enetr the withdraw amount");
		int withdraw = sc.nextInt();
		withdraw = balance - withdraw;
		System.out.println(withdraw);
		
	}

	@Override
	public void name() {
		System.out.println("name is"+name);
		
	}
	 
 }












public class bankdetails_interface {

	public static void main(String[] args) {
		sbi ob = new sbi();
		ob.name = "oparu";
		ob.accountnum();
		ob.balance();
		ob.deposit();
	}

}
