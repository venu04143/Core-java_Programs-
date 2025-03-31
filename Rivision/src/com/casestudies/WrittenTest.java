package com.casestudies;

public class WrittenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		pattern(n);

	}
	static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2;j++) {
				if((i+j)%4==0 || (i==2 && j%4==0)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
