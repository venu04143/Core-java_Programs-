package com.assignmentsoncunstructors;

public class Emplyoee {

	
	int empId;
	String ename;
	double esal;
	
	Emplyoee(){
		
	}
	Emplyoee(int empId, String ename, double esal){
		this.empId=empId;
		this.ename=ename;
		this.esal=esal;
		
	}
	
	
	public static void main(String[] args) {
		
		Emplyoee emp1= new Emplyoee(1,"VenuGopal",10000.00);
		emp1.displayEmpDetatils();
		
		Emplyoee emp2 = new Emplyoee(2,"Pranay",25000.00);
		emp2.displayEmpDetatils();
		
		

	}
	
    void displayEmpDetatils() {
    	System.out.println("Emplyoee ID : " + empId);
    	System.out.println("Emmplyoee Name : "+ ename);
    	System.out.println("Emplyoee Salary : "+esal);
    	System.out.println("\n***************************\n");
    }
}
