package com.casestudies;

public class BinaryFormPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		binaryPattern(4);
	}

	static void binaryPattern(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1;j++) {
				if((i%2!=0 && j%2!=0) || (i%2==0 && j%2==0)){
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}System.out.println();
		}
	}
}
