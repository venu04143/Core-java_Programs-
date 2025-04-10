package com.alphabetpatterns;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pyramid(5);
	}
	static void pyramid(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(char j='A';j<'A'+i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
