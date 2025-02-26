package com.assignmentsoncunstructors;

public class Bike {
	
	String companyName;
	String model;
	String color;
	double cc;
	double milage;
	
	
        Bike(String companyName, String model, String color, double cc, double milage) {
        	
        //this("Bajaj","Pulsur","Red",1500.00,40); Recursive constructor invocation Bike(String, String, String, double, double
        	
		this.companyName = companyName;
		this.model = model;
		this.color = color;
		this.cc = cc;
		this.milage = milage;
	}
        
        Bike(String companyName, String model, String color, double cc) {
        	this("Bajaj","Pulsur","Red",150.00,40);
    		this.companyName = companyName;
    		this.model = model;
    		this.color = color;
    		this.cc = cc;
        }
        
        Bike(String companyName, String model, String color) {
        	this("Bajaj","Pulsur","Red",150.00);
    		this.companyName = companyName;
    		this.model = model;
    		this.color = color;
        }
        
        Bike(String companyName, String model) {
        	this("Bajaj","Pulsur","Red");
    		this.companyName = companyName;
        	this.model = model;
        }
        
        Bike(String companyName) {
        	// System.out.println("parameter constructor1 called..");
        	this("Bajaj","Pulsur");    // Constructor call must be the first statement in a constructor
    		this.companyName = companyName;
        }


      Bike(){
    	  this("Bajaj");
    	  
    	  
      }

	public static void main(String[] args) {
		
		Bike b1 =new Bike(); 
		System.out.println(b1.companyName);
		System.out.println(b1.model);
		System.out.println(b1.color);
		System.out.println(b1.cc);
		System.out.println(b1.milage);
		System.out.println("\n******************\n");
		
		Bike b2 = new Bike("Honda");
		System.out.println(b2.companyName);
		System.out.println(b2.model);
		System.out.println(b2.color);
		System.out.println(b2.cc);
		System.out.println(b2.milage);
		System.out.println("\n******************\n");
		
		Bike b3 = new Bike("Honda","Shine");
		System.out.println(b3.companyName);
		System.out.println(b3.model);
		System.out.println(b3.color);
		System.out.println(b3.cc);
		System.out.println(b3.milage);
		System.out.println("\n******************\n");
		
		Bike b4 =new Bike("Hero","Glammer","Blue");
		System.out.println(b4.companyName);
		System.out.println(b4.model);
		System.out.println(b4.color);
		System.out.println(b4.cc);
		System.out.println(b4.milage);
		System.out.println("\n******************\n");
		
		Bike b5 = new Bike("TVS","Starcity","White",50);
		System.out.println(b5.companyName);
		System.out.println(b5.model);
		System.out.println(b5.color);
		System.out.println(b5.cc);
		System.out.println(b5.milage);
		System.out.println("\n******************\n");
		
		Bike b6 = new  Bike("Suzuki","Zixer","Green",175,45);
		System.out.println(b6.companyName);
		System.out.println(b6.model);
		System.out.println(b6.color);
		System.out.println(b6.cc);
		System.out.println(b6.milage);
		System.out.println("\n******************\n");
		
	}

}
