package com.rivisionOncunstructors;

public class Constructor {
	
	int id;
	String name;
	
	String colname;
	
	String Subname;
	
	Constructor(){
		
	}
	
	public Constructor(int id, String name) {      // creating multiple constructors in same class with different parameters is called constructor overloading

		this.id = id;
		this.name = name;         // this is a keyword and it refers the current instance data .By using this keyword we can access instance variable and methods
		                          //using this is some time mandatory and some times not mandatory
		                         // to avoid  conflict between local variables and instance variables we use this keyword
	}
	

	public Constructor(int id, String name, String colname, String Subname) {

		this.id = id;
		this.name = name;
		this.colname = colname;
		this.Subname = Subname;
	}




	public static void main(String[] args) {
		/* A constructor is special method in java .it has no return type not even void.
		 * the class name and constructor name must be same
		 * 
		 * constructor is used to initialize objects and to instantiating instance variables 
		 * 
		 *  constructor will execute when an object is created
		 *  
		 * there are three types of constructors
		 * 1 default constructor -> java compiler will provide default constructor when no constructor is presented in program
		 * 2 no-arg constructor -> java compiler will not provide default constructor if we have parameterized constructors
		 * 3 parameterized constructor -> a constructor which accepts parameters or a constructor with parameters is called parameterized constructor
		 * */
		
		Constructor c1 = new Constructor();  // no- arg constructor will called
		
		Constructor c2 = new Constructor(21,"Venu");   //constructor with 2  parameters called
		System.out.println(c2.id);
		System.out.println(c2.name);
		
		Constructor c3 = new Constructor(31,"Pranay","RVR","JAVA"); // constructor with 4  parameters called
		System.out.println(c2.id);
		System.out.println(c3.name);
		System.out.println(c3.colname);
		System.out.println(c3.Subname);
	}

}
