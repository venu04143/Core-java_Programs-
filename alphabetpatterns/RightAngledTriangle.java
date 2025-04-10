package com.alphabetpatterns;

public class RightAngledTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rightAngle(5);
		
		System.out.println();
		
		reverseRightAngle(5);
	}
	
	static void rightAngle(int n) {
		for(int i=1;i<=n;i++) {
			for(char j ='A';j<'A'+i;j++) {
				System.out.print(j+" " );
			}
			System.out.println();
		}
	}
	
	static void reverseRightAngle(int n) {
		
		for(int i=n;i>=1;i--) {
			for(char j='A';j<'A'+i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
