package com.assignmentsonloops;

public class GeneratingOTP {
	
	static String generateOtp() {
		String otp="";
		for(int i=1;i<=6;i++) {
		otp= otp +(int)(Math.random()*10);
		}
		return otp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      String oTp=generateOtp();
      System.out.println(oTp);
		
	}

}
