package com.starpatterns;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

		int index =0;
		for(int i=0;i< 2*arr.length-1;i++) {
			
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k<arr.length;k++) {
					if(j+k==index) {
						System.out.print(arr[j][k]+" ");
					}
				}
			}
			index++;
			System.out.println();
			
		}

	}

}
