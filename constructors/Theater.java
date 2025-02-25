package com.constructors;

class Theater {
	
	String tname;
	String taddress;	
	
	Theater(){
		this("KR Complex");
	}
	
	Theater(String tname){
		this(tname,"CPT");
	}
	
	Theater(String tname,String taddress){
		this.tname=tname;
		this.taddress=taddress;
		
	}
    
	
}
class Movie extends Theater{
	
	String mname;
	int mreleaseDate;
	
	Movie(){
		this("Devara");
	}
	Movie(String mname){
		this(mname,15);
		
	}
	Movie(String mname,int mreleaseDate){
		super();
		this.mname=mname;
		this.mreleaseDate=mreleaseDate;
	}
	Movie(String mname,int mreleaseDate,String tname,String taddress){
		super(tname,taddress);
		this.mname=mname;
		this.mreleaseDate=mreleaseDate;
	}
	void display() {
		System.out.println("Theater name : "+ tname);
		System.out.println("Theater Address: "+ taddress);
		System.out.println("Movie Name : "+ mname);
		System.out.println("Movie release date : "+ mreleaseDate + "\n");
	}
public static void main(String[] args) {
		
		Movie m1 = new Movie();
		m1.display();
		
		Movie m2 = new Movie("SALAR",21,"SaiKarthik","CPT");
		m2.display();
		
	}
	
}
