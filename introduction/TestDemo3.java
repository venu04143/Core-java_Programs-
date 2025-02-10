package com.introduction;

public class TestDemo3 {

	
	
	public static void main(String[] args) {
		
		TestDemo3 t=new TestDemo3(); 
		
		System.out.println("Main Method Called");

	}
	
	
	{
		
		System.out.println("Instance block");
	}
	
	
	static {
		System.out.println("Static block1 Called");
	}
	
	static {
		System.out.println("Static block2 Called");
	}
	static TestDemo3 m=new TestDemo3();

}
