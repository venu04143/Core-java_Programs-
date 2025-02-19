package com.datatypes;

public class WrapperObjects {
	
	Integer I = 234;  // converting  primitive to Wrapper (called Auto Boxing)
	int i= I;        // converting Wrapper to primitive (called Auto Un-boxing)
	
	Byte B = 12;
	byte b = B;
	
	Short S = 50;
	short s=S;
	
	Long L=100L;
	long l=L;
	
	Float F = 10.5f;
	float f =F;
	
	Double D =20.5;
	double d = D;
	
	Character C ='M';
	char c =C;
	
	Boolean T = true;
	
	boolean t =T;
	

	public static void main(String[] args) {
		
		WrapperObjects data = new WrapperObjects();
		
		System.out.println("Wrapper Ineger :"+data.I);
		System.out.println("primitive int :"+data.i);

		System.out.println("Wrapper Byte :"+data.B);

		System.out.println("primitive byte :"+data.b);

		System.out.println("Wrapper Short :"+data.S);

		System.out.println("primitive short :"+data.s);

		System.out.println("Wrapper Long :"+data.L);

		System.out.println("primitive long :"+data.l);

		System.out.println("Wrapper Float :"+data.F);
		System.out.println("primitive float  :"+data.f);
		
		System.out.println("Wrappper Double :"+data.D);

		System.out.println("primitive double :"+data.d);

		System.out.println("Wrapper Character :"+data.C);
		System.out.println("primitive char :"+data.c);

		System.out.println("Wrapper Boolean :"+data.T);
		System.out.println("primitive boolean :"+data.t);



		
	}

}
