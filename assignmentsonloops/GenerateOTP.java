package com.assignmentsonloops;

import java.util.Random;

public class GenerateOTP {
	
	static String generateOtp() {
		String otp="";
		Random sc = new Random();
		for(int i =0;i<6;i++) {
			otp = otp + sc.nextInt(10);
		}
		return otp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String otp = generateOtp();
		System.out.println(otp);
		
		

	}

}
