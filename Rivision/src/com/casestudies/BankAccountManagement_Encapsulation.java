package com.casestudies;


public class BankAccountManagement_Encapsulation {
	
	private String holderName;
	private int accountNumber;
	private double accountBalance;
	
   
	BankAccountManagement_Encapsulation(){
		this("Venu",630055,500);
	}


	public BankAccountManagement_Encapsulation(String holderName, int accountNumber, int accountBalance) {
		
		this.holderName=holderName;
		this.accountNumber=accountNumber;
		this.accountBalance=accountBalance;
	}
	
	public void setHolderName(String holderName) {
		this.holderName=holderName;
		System.out.println("Holder Name Changed SucessFully !");
	}
	public String getHolderName() {
		return holderName;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
		System.out.println("Account Number Changed SucessFully !");
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance=accountBalance;
		System.out.println("Account Balance Updated.");
	}
	public double getAccountBalance() {
		return accountBalance;
	}

	
	public void deposit(double money) {
		
		if(money >0) {
			this.accountBalance+=money;
			System.out.println("Amount Deposited SucessFully : Your Account Balnce is "+this.accountBalance);
		}else {
			System.out.println("Please Deposite Valid Amount.");
		}
	}
	
	public void withdraw(double money) {
		   if(money<=this.accountBalance) {
			   this.accountBalance -= money;
			   System.out.println("Money WithDrawl is SucessFull. Your Current Available Balance is "+this.accountBalance);
		   }else {
			   System.out.println("Insufficient Balance.");
		    }
	}
}
