package com.rivisionOncunstructors;

public class Copyconstructor1 {
     public static void main(String[] args) {
		
    	 Super s1 = new Super();
    	 s1.show();
    	 
    	 Super s2 = new Super(81,"Venu",26000,"BNG");
    	 s2.show();
    	 
    	 Super s3 = new Super(82,"Harshini",s2);  // copy constructor creates a new object by copying the values of existing object 
    	 s3.show();
	}
}
class Super{
	int Id;
	String empName;
	double salary;
	String empLoc;
	
	Super(){
		this(80,"Keziya");
	}
	Super(int id,String empName){
		this(id,empName,25000,"HYD");
	}
	
	Super(int id,String empName,Super obj){
		this.salary=obj.salary;
		this.empLoc=obj.empLoc;
		this.Id=id;
		this.empName=empName;
	}
	
	Super(int id, String empName, double salary, String empLoc) {

		Id = id;
		this.empName = empName;
		this.salary = salary;
		this.empLoc = empLoc;
	}
	void show() {
		System.out.println("Employee Id : "+ Id);
		System.out.println("Employee Name : "+ empName);
		System.out.println("Employee Salary : "+ salary);
		System.out.println("Employee Location : "+ empLoc);
		System.out.println("\n***********************\n ");
	}
	
}
