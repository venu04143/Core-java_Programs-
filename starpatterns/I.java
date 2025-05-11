package com.starpatterns;

public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		i(5);
	}
	
	static void i(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==(n/2)+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
			
		}
	}

}
