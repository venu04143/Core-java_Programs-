package com.arraysintroduction.threedimentionalarrays;

public class ThreeDArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] arr3D = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}},{{19,20,21},{22,23,24},{25,26,27}}};

		for(int i=0;i<arr3D.length;i++) {
			for(int j=0; j<arr3D[i].length;j++) {
				for(int k=0;k<arr3D[i][j].length;k++) {
					System.out.print(arr3D[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();

		}
		
		for(int[][] arr2D :arr3D) {
			for(int[] arr1D :arr2D) {
				for(int num :arr1D) {
					System.out.print(num+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
