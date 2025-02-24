package com.rivisionOncunstructors;

public class Chaining2 {
    public static void main(String[] args) {
    	
    	Parent p1 = new Parent();
    	p1.display();
    	
		Child c1 = new Child();
		c1.show();
		
		Child c2 = new Child(65,'P');
		c2.show();
		
		Child c3 = new Child("Eswar",3,88,'P');
		c3.show();
	}
}
class Parent {
	String Sname;
	int Id;
	Parent(){
		this("Venu",80);
	}
	Parent(String Sname,int Id){
		this.Sname=Sname;
		this.Id = Id;	
	}
	void display() {
		System.out.println("Student Name : "+ Sname);
		System.out.println("Student Id : "+ Id);
		 System.out.println("\n***************\n");
	}

}
class Child extends Parent{
	double marks;
	char status;
	
	Child(){
		this(35,'P');
	}
	Child(double marks,char status){
		super();
		this.marks=marks;
		this.status=status;
	}
	Child(String Sname,int Id,double marks,char status){
		super(Sname,Id);
		this.marks=marks;
		this.status=status;
	}
	void show() {
	   System.out.println("Student Name : "+ Sname);
	   System.out.println("Student Id : "+ Id);
	   System.out.println("Student Name : "+ marks);
	   System.out.println("Student Name : "+ status);
	   System.out.println("\n***************\n");
   }
}
