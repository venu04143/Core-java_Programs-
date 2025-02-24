package com.rivision;

public class Rivision1 {
	
	int num;                    // whenever the data changing from one object to another object that we declare variable as instance variable
	String name;
	
	
	static String country;       // whenever the data is same for all the object then we can declare that data  in static variable
	static int countryId;
	

	public static void main(String[] args) {
		
		System.out.println("main method Started");
		
		Rivision1 r1 = new Rivision1();
		
		System.out.println(country);            // by default jvm provides default values for static variables when the class is loading
		System.out.println(countryId);
		System.out.println(r1.num);             // jvm will provide default values for instance variables when an object is created
		System.out.println(r1.name);
		
		
		countryId = 91;         // assigning the data
		country="India";
		
		r1.num=101;
		r1.name="venu";
		
		
		
		System.out.println(country);
		System.out.println(countryId);
		System.out.println(r1.num);
		System.out.println(r1.name);
		
		
		country="Germany";                // we can change static data  
		countryId = 21;
		
		Rivision1 r2 = new Rivision1();
		
		r2.num=201;
		r2.name="Hitler";
		
		System.out.println(country);
		System.out.println(countryId);
		System.out.println(r2.num);
		System.out.println(r2.name);
		
        Rivision1 r3 = new Rivision1();
		
		r3.num=301;
		r3.name="Pablo";
		
		System.out.println(country);
		System.out.println(countryId);
		System.out.println(r2.num);
		System.out.println(r2.name);
		
		
		

	}

}
