package com.starpatterns;

public class N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		n(5);
	}
	static void n(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				if(j==1 || j==n || i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
