package com.constructors;

public class StudentDetails {
	
	String studentName;
	
	int rollNo;
	
	String branch;
	
	String  year;
	
	double percentage;
	
	StudentDetails(){
		
	}
	
	StudentDetails(String studentName,int rollNo,String branch,String  year,double percentage){
		this.studentName=studentName;
		this.rollNo=rollNo;
		this.branch=branch;
		this.year=year;
		this.percentage=percentage;
	}
	StudentDetails(String studentName,int rollNo,String branch,String  year){
		this.studentName=studentName;
		this.rollNo=rollNo;
		this.branch=branch;
		this.year=year;
	}
	StudentDetails(String studentName,int rollNo,String branch){
		this.studentName=studentName;
		this.rollNo=rollNo;
		this.branch=branch;
	}
	StudentDetails(String studentName,int rollNo){
		this.studentName=studentName;
		this.rollNo=rollNo;
	}
	StudentDetails(String studentName){
		this.studentName=studentName;
	}
	
	public static void main(String[] args) {
		
	System.out.println("StudentName\tRollNo\tBranch\tYear\t    Percentage");
	StudentDetails venu = new StudentDetails("VenuGopal",2090,"CSE","2nd Year",60.0);
	venu.display();
	
	StudentDetails pranay = new StudentDetails("   Pranay",2091,"ECE","1st Year  ");
	pranay.display();
	
	StudentDetails Eshwar = new StudentDetails("   Eshwar",2092,"MECH  ");
	Eshwar.display();
	
	StudentDetails suma = new StudentDetails("   Suma  ", 2093);
	suma.display();
	
	StudentDetails lucky = new StudentDetails("   Lucky  ");
	lucky.display();
	}
	
	void display() {
		
		System.out.println();
		System.out.println(studentName+"\t"+rollNo+"\t"+branch+"\t"+year+"\t"+percentage);
	}

}
