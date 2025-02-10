package com.introduction;

public class TestDemo6 {
	
	//static int i=0;

	public static void main(String[] args) {
	
		System.out.println("main method called");
		byte b=127;
		System.out.println(b);

//     method1();
//     method1();
//     method1();
//     method1();
//     method1();
//	}
//	
//	public static void method1() {
//		i+=1;
//		System.out.println(i);
		
			
	}
		
	static void method1() {
		System.out.println("Static Meethod");
	}
	
	void method2() {
		System.out.println("Instance Method");
		
	}
	
	static {
		System.out.println("static block called");
	}
	
	static TestDemo6 n=new TestDemo6();
	static {
		method1();
		n.method2();
		System.out.println("static block2 called");
	
	}
	
	{
		System.out.println("Instance block called");
	}
	

}
