package com.arraysintroduction.threedimentionalarrays;

public class ThreeDArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][][] arr3D = {{{"Adiseshu","Venkayamma"},{"Dhanalaksmi","Koteswarao"}},{{"Annapurna","Lakshman"},{"VenuGopal"}}};

		for(int i=0;i<arr3D.length;i++) {
			for(int j=0;j<arr3D[i].length;j++) {
				for(int k=0;k<arr3D[i][j].length;k++) {
					System.out.print(arr3D[i][j][k] +" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		for(String[][] arr2D:arr3D) {
			for(String[] arr1D : arr2D) {
				for(String name :arr1D) {
					System.out.print(name+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
