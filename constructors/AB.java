package com.constructors;

public class AB {
	int x;
	
	AB(int p){
		x=p;
	}
	void show() {
		System.out.println("Class A...");
		System.out.println("X  = "+x);
	}
	public static void main(String[] args) {
		CD c1 = new CD(10,20,30);
		c1.show();
		c1.display();
		c1.message();
	}
}
class BC extends AB{
	int y;
	BC(int p, int q){
		super(p);
		y=q;
	}
	void display() {
		System.out.println("Class B...");
		System.out.println("Y  = "+y);
	}
}
class CD extends BC{
	int z;
	
	CD(int p, int q, int r){
		super(p,q);
		z=r;
	}
	void message() {
		System.out.println("Class C ...");
		System.out.println("Z  = "+z);
	}
}

	
