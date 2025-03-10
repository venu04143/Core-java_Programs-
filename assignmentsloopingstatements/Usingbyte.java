package com.assignmentsloopingstatements;

public class Usingbyte {

	public static void main(String[] args) {
	int b1=0;
	for(byte b= 0;b<10;b++) {
		b1+=b;
		System.out.println(b);
	}System.out.println(b1);

	
//	for (byte b = 120;b<130;b++) {   infinite loop because of byte overflow. means :after 127 it internally converting -128 
//		System.out.println(b);       so -128 is still less than 130 so infinite loop
//	}
	
	
//	for (byte b=120;b<=127;b++) {    same as after 127 b++ increment(-128) and it is checking -128 still less than so infinite loop
//		System.out.println(b);
//	}
	
	for(byte b = 120;b<127;b++) {
		System.out.println(b);
	}
	byte b3=0;
	for(byte b =120; ;b++) {
		b3+=b;
		System.out.println(b);
		if(b==127) {
			break;
		}
	}
	System.out.println(b3);
	
//	byte B =1;
//	byte rem =0;
//	for(byte b =1 ;b<5;b++) {            Type mismatch: cannot convert from int to byte
//		B=rem+b;
//	}
	}

}
