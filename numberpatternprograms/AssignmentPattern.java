package com.numberpatternprograms;

public class AssignmentPattern {
	
	/* 1
	   3 2
	   6 5 4
	   10 9 8 7
	   15 14 13 12 11*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		for(int i=1;i<=5;i++) {
			num+=i;
			for(int j=num;j>num-i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j ||(i%2!=0 && j%2!=0) ||j==(5-i+1) ) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
