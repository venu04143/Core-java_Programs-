package com.recursion;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pattern(5,1,1);
	}
	static void pattern(int n,int i,int j){
		if(i>n) {
			return;
		}
		if(j<=i) {
		  System.out.print("*");
		  pattern(n,i,j+1);
		}else {
			System.out.println();
			pattern(n,i+1,1);
		}
	}

}
