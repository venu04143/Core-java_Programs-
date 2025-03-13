package com.assignmentsonloops;

import java.util.Random;
import java.util.Scanner;

 public class ValidOTP {
	 
	 
	static String generateOtp() {
		String otp="";
		Random sc = new Random();
		for(int i =0;i<6;i++) {
			otp = otp + sc.nextInt(10);
		}
		return otp;
	}
	static  void validation() {
		
		String otp = generateOtp();
		System.out.println(otp);
	     
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the OTP : ");
		String OTP =sc.next();
		
		if(otp.equals(OTP)) {
			System.out.println("OTP Matched.ThankYou! ");
		}
		else {
			System.out.println("OTP Missmatched :");
			String yn="";
			System.out.println("Do you want to Re-Send the OTP : Yes / NO :");
			yn=sc.next();
				
			if(yn.equalsIgnoreCase("Yes")) {
				validation();	
			}
			else {
				return;
			}
			    
				
		}
			
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		validation();
		
		
	}

}
