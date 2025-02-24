package com.rivisionOncunstructors;

public class Chaninig1 {
	
	String surname;
	String name;
	String fatherName;
	String motherName;
	
	Chaninig1(){
		this("Ontipuli","VenuGopal");   // constructor chaining is a process of calling one constructor from another constructor with in a class or between parent and child class
	}                                   // we can achieve constructor chaining 
	
	Chaninig1(String surname, String name) {
		this(surname,name,"Adiseshu","Venkayamma"); // this()is used to call a matching constructor  in a  current class
	}
	
	Chaninig1(String surname, String name, String fatherName, String motherName) {
		this.surname = surname;
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
	
	void show() {
		System.out.println("Surname  : "+ surname);
		System.out.println("Name  : "+ name);
		System.out.println("Father Name  : "+ fatherName);
		System.out.println("Mother Name  : "+ motherName);
		System.out.println("\n********************\n");
	}
	public static void main(String[] args) {
		System.out.println("main method called...");
		
		Chaninig1 c1 = new Chaninig1() ;
			
			c1.show();
			
	    Chaninig1 c2 = new Chaninig1("Gunji","AnnaPurna");
	      
	       c2.show();
	       
	    Chaninig1 c3 = new Chaninig1("Gunji","DhanaLakshmi");
		      
	       c3.show();
	       
	    Chaninig1 c4 = new Chaninig1("Gunji","Lokesh","Koteswarao","DhanaLakshmi");
		      
	       c4.show();
		
	}
	
	

}
