package com.assignmentsoncunstructors;

public class Constructor1 {
	
	String name;
	
	int age;
	
	double sal;
	
	double height;
	
	Constructor1(){
		this("Venu",23);
	}
	Constructor1(String name, int age){
		this(name,age,15000,5.7);
	}
	Constructor1(String name,int age,double sal,double height){
		this.name=name;
		this.age=age;
		this.sal=sal;
		this.height=height;
	}
	void show() {
	System.out.println(name);
	System.out.println(age);
	System.out.println(sal);
	System.out.println(height);
	}
	
	

	public static void main(String[] args) {
		
		Constructor1 c1 = new Constructor1();
		c1.show();
		
		Constructor1 c2 = new Constructor1("Pranay",6);
		c2.show();
		
		
	}

}
