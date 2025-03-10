package com.assignmentsloopingstatements;

public class UsingShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		for(short s =0;s<10;s++) {
			System.out.println(s);
			
		}
		
//		for(short s =32760;s<32768;s++) {  short overflow when it reaches 32767 next it turn to -32768 which is smaller 
//			System.out.println(s);         condition specified then causing infinite loop
//		}
		
		for(short s = 32760;s<32767;s++) {
			System.out.println(s);
		}
		System.out.println("***************");
		
		for(short s =32760; ; s++) {
			System.out.println(s);
			if(s==32767) {
				break;
			}
		}
	}

}
