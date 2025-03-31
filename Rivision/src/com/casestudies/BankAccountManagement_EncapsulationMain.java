package com.casestudies;

public class BankAccountManagement_EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccountManagement_Encapsulation holder1 = new BankAccountManagement_Encapsulation();
		
		System.out.println(holder1.getAccountBalance());
		
		holder1.setHolderName("Venu Gopal");
		holder1.setAccountNumber(3303020);
		holder1.setAccountBalance(1000);
		
		System.out.println(holder1.getHolderName());
		System.out.println(holder1.getAccountNumber());
		System.out.println(holder1.getAccountBalance());
		
		holder1.deposit(300);
		holder1.withdraw(1300);
	
	}

}
