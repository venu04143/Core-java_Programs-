package com.constructors;

import java.util.Scanner;

public class PracticeOnCunstructors2 {
	
	double height;
	double width;
	
	
	
	PracticeOnCunstructors2(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height :");
		 height=sc.nextDouble();
		 
		 System.out.print("Enter width :");
		 width=sc.nextDouble();
//		height=2.0;
//		width=2.0;
//		 
		
	}
	 PracticeOnCunstructors2(double height,double width) {
		this.height=height;
		this.width=width;
		
	}
	void  area() {
		System.out.println(height*width);
	}
	
	

	public static void main(String[] args) {
		
		PracticeOnCunstructors2 ans= new PracticeOnCunstructors2();
        
		ans.area();
		
		PracticeOnCunstructors2 ans1= new PracticeOnCunstructors2();
		ans1.area();
		
		PracticeOnCunstructors2 ans3 = new PracticeOnCunstructors2(12.2,10.5);
		ans3.area();
		
		
		
		
	}

}
