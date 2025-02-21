package com.constructors;

public class Person {

	String name;
    int age;
    
    Person(){
    	this("Venu");
    	System.out.println("no arg constructor called from Person class..");
    }
    Person(String name){
    	this("Venu",23);
    	this.name =name;
    	System.out.println("parameterize 1 called from Person class..");
    	
    }
    Person(String name, int age){
    	this.name=name;
    	this.age=age;
    	System.out.println("parameterized 2 constructor called from Person class..");
    	
    }
    void display() {
    	System.out.println("Person name : "+name);
    	System.out.println("Person age : "+age);
    }
    public static void main(String[] args) {
		
    	System.out.println("Person main method called...");
    	
    	Person p1= new Person();
    	p1.display();
	}

}
class Doctor extends Person{
	
	String name;
	int age;
	
	Doctor(){
		this("Venu");
		System.out.println("Doctor class no arg constructor called");
	}
	
	Doctor(String name){
		this("Venu",23);
		this.name=name;
		System.out.println("Doctor class perameterized 1 constructor called");
		
	}
	Doctor(String name , int age){
		super();
		this.name =name;
		this.age=age;
		System.out.println("Doctor class perameterized 2 constructor called");
		
		
	}
	void display1() {
		System.out.println("Doctor name  :"+ name);
		System.out.println("Doctor age  :"+ age);
	}
	public static void main(String[] args) {
		System.out.println("Doctor main method called..");
		
		Doctor d1 = new Doctor();
		d1.display1();
		
		Doctor d2 = new Doctor("EWSAR",21);
		d2.display1();
	}
}
