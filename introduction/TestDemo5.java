package com.introduction;

public class TestDemo5 {
	
	
	static int val=0;
	 
	public static void main(String[] args) {
	 
        //method5();
		m1();
		m1();
		m1();
		m1();
		m1();
	}
	static void m1() {
		val+=1;
		System.out.println(val);
	}
	
	
	static void method1() {
		val+=1;
		System.out.println(val);
	}
	static void method2() {
		method1();
		val+=1;
		System.out.println(val);
	}
	static void method3() {
		method2();
		val+=1;
		System.out.println(val);
	}
	static void method4() {
		method3();
		val+=1;
		System.out.println(val);
		
	}
	static void method5() {
		method4();
		val+=1;
		System.out.println(val);
		
	}
	

}
