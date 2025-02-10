package com.introduction;

public class TestDemo1 {

	public static void main(String[] args) {
		method1();
		 

	}
	
	
	public static void method1 () {
		
		System.out.println("Method1 Called !");
		method2();
	}
	
	public static void method2() {
		System.out.println("Method2 Called !");
		
		 TestDemo1 t1 =new TestDemo1();
		
		t1.method3();
	}
	
	public void method3() {
		System.out.println("Method3 Called !");
		method4();
		
	}
	
	public void method4() {
		System.out.println("Method4 Called !");
		method5();
	}
	
	public static void method5() {
		System.out.println("Method5 called !");
	}

}
