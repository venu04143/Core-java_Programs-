package com.assignmentsoncunstructors;

public class Maths {

	int r;
	int q;

	Maths() {
		this(10);
	}

	Maths(int x) {
		this(10, 20);
	}

	Maths(int x, int y) {
		this(10, 20, 30);
	}

	Maths(int x, int y, int z) {
		System.out.println(x + y + z);

	}

	public static void main(String[] args) {
		Maths m1 = new Maths();
		
		int x = 10;
		System.out.println(~x);

	}

}
