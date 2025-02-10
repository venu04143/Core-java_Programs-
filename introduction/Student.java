package com.introduction;

public class Student {
	
	int rollNo;                                // instance variables
	String Sname;
	
	 
	static int CollageId=20905;                // static variables
	static String Collagename = "SEREC";
	
	
	public static void main(String[] args) {
		
		int CollageId=10;         
		// local variable
		System.out.println("local variable :"+CollageId);
		System.out.println("---------------------");
		
		Student s1=new Student();
		
		s1.rollNo=504;
		s1.Sname="Venu";
		
		System.out.println("Collage id :"+ Student.CollageId);   // local variable name and static variable name in class are same so then  
		System.out.println("Collage Name:"+Collagename);         // we accessed the static data by class reference.
		
		System.out.println("Student roolID :"+s1.rollNo);
		System.out.println("Student Name :"+s1.Sname);
		
		System.out.println("---------------------");
		
		Student s2 = new Student();
		
		s2.rollNo = 506;
		s2.Sname = "Goapl";
		
		System.out.println("Collage id :"+ Student.CollageId); 
		System.out.println("Collage Name:"+Collagename);
		
		System.out.println("Student roolID :"+s2.rollNo);
		System.out.println("Student Name :"+s2.Sname);
		System.out.println("---------------------");
		
		Student s3 = new Student();
		
		Student.CollageId= 20905026;   
		Collagename="Sri Chundi Ranganayakulu";
		
		s3.rollNo=507;
		s3.Sname="Venu Gopal";
		
		System.out.println("Student roolID :"+s3.rollNo);
		System.out.println("Student Name :"+s3.Sname);
		System.out.println("Collage id :"+ Student.CollageId); 
		System.out.println("Collage Name:"+Collagename);
		

	}

}
