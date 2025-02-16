package com.literals;

public class IntegralLiterals {
	
	

	public static void main(String[] args) {
		
		System.out.println("Decimal Numbers.........");
		int x = 10;
		int y =20;
		System.out.println(x + "\n" + y);
		
		System.out.println("Octal Numbers...........");
		
		
		int a =010;
		int b =0123;  // octal Number :base 8-->0 to 7
		// 0 + 1*8^2 + 2*8^1 + 3*8^0 
		//     64    + 16    + 3    = 83;
		int c =0345;
		//  3*8^2+4*8^1+ 5*8^0 =229
		
		//int d = 04587;     base only 0 to 7 only 8 given
		
		//int d = 0574569;   he literal 0574569 of type int is out of range 
		
		
		System.out.println(a);
		System.out.println(b); 
		System.out.println(c);
		
		System.out.println("Hexa Decimal Number...........");
          
		int m = 0x123; // where x or X is for representing hexa decimal
		int n = 0xabee;    // base 16 (0-9 and (a-f) or (A-F) a=10, f =15
		 
		  // 10*16^3+11*16^2+14*16^1+14*16^0
		
		int o =0xADFACFAD;
		//    10*16^7+13*16^6+15*16^5+10*16^4+12*16^3+15*16^2+10*16^1+13*16^0
		
		
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}

}
