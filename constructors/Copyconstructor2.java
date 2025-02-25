package com.constructors;

public class Copyconstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A(10,20,30,40,50);
		obj.show();
		A obj2 = new A(obj,100);
		obj2.show();

	}

}
class A{
	
	int a,b,c,d,e;
	
	A(int a, int b, int c, int d, int e){
		
		this.a=a;
		this.b= b;
		this.c = c;
		this.d=d;
		this.e=e;
	}
	A(A obj,int c){
		this.c =c;
		this.a=obj.a;
		this.b=obj.b;
		this.d=obj.d;
		this.e=obj.e;
	}
	void show() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("\n**********************\n");
		
	}
}

