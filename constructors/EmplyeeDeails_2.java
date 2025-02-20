package com.constructors;

public class EmplyeeDeails_2 {
	
	
	static int empId;
	static String empName;
	static double empSal;
	static String empLocation;
	
	
	   EmplyeeDeails_2(int empId, String empName,double empSal,String empLocation ){
		
		this.empId=empId;     // parameterized constructors are used to pass the values while creating an object
		this.empName=empName;
		this.empSal=empSal;
		this.empLocation=empLocation;
	}
	EmplyeeDeails_2(int empId, String empName){
		this.empId=empId;
		this.empName=empName;
	}

	public static void main(String[] args) {
		
		EmplyeeDeails_2 venu = new EmplyeeDeails_2(1,"venu",2000,"hyd");
		
		venu.display();

		EmplyeeDeails_2 pranay = new EmplyeeDeails_2(2,"pranay",3000,"Benguluru");
		pranay.display();
		
		
		EmplyeeDeails_2 eswar = new EmplyeeDeails_2(3,"eswar");
		eswar.display();
		
		EmplyeeDeails_2 gopal = new EmplyeeDeails_2(4,"Gopal");
		
		
		
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name :"+empName);
		

		
	}
	
	
	
	
	void display() {
		
		System.out.println("Employee Id :"+empId);
		
		System.out.println("Employee Name :"+empName);
		
		System.out.println("Employee Sal :"+empSal);
		
		System.out.println("Employee Location :"+empLocation);
		
		System.out.println("**********************");
		
	}
	
	

}
