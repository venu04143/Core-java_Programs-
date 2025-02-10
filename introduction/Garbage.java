package com.introduction;

public class Garbage {
	
	protected void finalize() {
		System.out.println("garbage Collector");
	}

	public static void main(String[] args) {
		
		Garbage g1 =new Garbage();
		Garbage g2 =new Garbage();
		Garbage g3 =new Garbage();
		
		//Nullifying the objects
		g1=null;
		g2=null;
		
		
		//runs the garbage collector
		System.gc();
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		

	}
	/* if we want to call garbage collector explicitly  we need call
	 * System.gc(); method then it calls finalize method internally,
	 * then the finalize method will remove the unused objects
	 *  the finalize is from object class
	 */

}
