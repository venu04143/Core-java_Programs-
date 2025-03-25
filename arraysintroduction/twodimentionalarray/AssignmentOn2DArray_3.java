package com.arraysintroduction.twodimentionalarray;

public class AssignmentOn2DArray_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},
				       {4,5,6},
				       {7,8,9}};
		
//		int row=0;
//		
//		while(row<arr.length) {
//			int col=0;
//			while(col<arr[row].length) {
//				System.out.print(arr[col][row]+" ");
//				col++;
//			}
//			row++;	
//           System.out.println();
//		}
		print(arr,0,0);

	}
	static void print(int[][] arr,int i,int j) {      // using recursion
		if(i==arr.length) {
			return;
		}
		System.out.print(arr[j][i]+" ");
		if(j==arr[i].length-1) {
			System.out.println();
			print(arr,i+1,0);
		}
		else {
			print(arr,i,j+1);
		}
		
	}

}
