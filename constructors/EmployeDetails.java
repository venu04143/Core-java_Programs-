package com.constructors;

public class EmployeDetails {

	int empId;
	String empName;
	int empSal;
	String empLocation;

	EmployeDetails() {

	}

	EmployeDetails(int empId, String empName, int empSal, String empLocation) {

		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empLocation = empLocation;
	}

	public static void main(String[] args) {

		EmployeDetails Venu = new EmployeDetails(20, "VenuGopal", 1000, "Hyderabad");

		System.out.println("Employee Id : " + Venu.empId);

		System.out.println("Employee Name : " + Venu.empName);

		System.out.println("Employee Sal : " + Venu.empSal);

		System.out.println("Employee Location : " + Venu.empLocation);

		System.out.println("********************************");

		EmployeDetails Pranay = new EmployeDetails(30, "Pranay", 2000, "Benguluru");

		System.out.println("Employee Id : " + Pranay.empId);

		System.out.println("Employee Name : " + Pranay.empName);

		System.out.println("Employee Sal : " + Pranay.empSal);

		System.out.println("Employee Location : " + Pranay.empLocation);

		System.out.println("********************************");

		EmployeDetails Eswar = new EmployeDetails();

		Eswar.empId = 20;
		Eswar.empName = "Eswar";
		Eswar.empLocation = "Pune";

		System.out.println("Employee Id : " + Eswar.empId);
		System.out.println("Employee Id : " + Eswar.empName);
		System.out.println("Employee Id : " + Eswar.empLocation);
		
		
		System.out.println("asdfghjhgfds \b dfg");
	}

}
