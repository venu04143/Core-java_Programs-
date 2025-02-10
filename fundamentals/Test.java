package com.fundamentals;

public class Test {

	int id;
	String name;
	
	static int val;
	static String Cname;
	
	static Test b=new Test();
	
	static {
		System.out.println("Static block execution");
	}
	{
		System.out.println("instance block will execute once every time when an object is created");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method will execute after static blocks");
		
	    Test t= new Test();
		
		System.out.println(val);
		System.out.println(Cname);
		
		t.id=10;
		t.name="venu";
		
		System.out.println(t.id);
		System.out.println(t.name);
		
		Test t1= new Test();
		
		t1.id=20;
		t1.name="gopal";
		
		Test.val=2090;
		Test.Cname="CR";
		
		System.out.println(t1.id);
		System.out.println(t1.name);
		

		System.out.println(val);
		System.out.println(Cname);
		
		// arithmatic operators
		
		System.out.println(val+t1.id);
		
		

	}

}
