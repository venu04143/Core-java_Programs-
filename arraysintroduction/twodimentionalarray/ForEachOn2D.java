package com.arraysintroduction.twodimentionalarray;

public class ForEachOn2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twoDarr= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int[]oneDarr:twoDarr) {        // oneDarr: stores sub arrays in twoDarr sequentially
			for(int value : oneDarr) {         // value: stores each element in the oneDarr
				System.out.print(value+" ");     // that value prints here.
			}
			System.out.println();
		}

	}

}
