package com.alphabetpatterns;

public class InvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reversePyramid(5);
	}
	static void reversePyramid(int n) {
		for(int i=n;i>=1;i--) {
			
			for(int s=i;s<n;s++) {
				System.out.print(" ");
			}
			for(char j='A';j<'A'+i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
