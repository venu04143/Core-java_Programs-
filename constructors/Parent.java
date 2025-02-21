package com.constructors;

public class Parent {
	
	int x;
	int y;
	
	Parent(){
		
	}
	Parent(int p){
		
		x=p;
	
	}
	Parent(int p,int q){
		this(p);
		y=q;
	}
	void show() {
		System.out.println("Addition of "+x + "and "+ y +"is "+ (x+y) );
	}

}
class Child extends Parent{
	int x;
	int y;
	int z;
	
	Child(){
		this(10,20);
	}
	Child(int p){
		this(p,20);
		
	}
	Child(int p ,int q){
		this(p,q,30);
		
	}
	Child(int p ,int q, int r){
		super(p,q);
		z=p;
		
	}
	void display() {
		System.out.println("Addition of "+x + " and " +y +" and "+z+ " is "+ (x+y+z));
	}
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.show();
	}
}
