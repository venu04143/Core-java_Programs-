package com.arraysintroduction.twodimentionalarray;

public class AssignmentOn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = {{9,8,7},{6,5,4},{3,2,1}};
		
		
		
		int[][] c =new int[b.length][b.length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int[] arr : c) {
			for(int value :arr) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
	
	}

}
