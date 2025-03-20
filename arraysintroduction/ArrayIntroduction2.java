package com.arraysintroduction;

public class ArrayIntroduction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];     // declaration and creation 
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		//arr[5] = 600;                  //  Index 5 out of bounds. it can't allow more than
		// 5 values to store in this array
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		 
		
//		int[] array = new int[-5];         if we give negative size it will not show compile time error
//		array[0] = 11;                     but throw java.lang.NegativeArraySizeException: -5
//		System.out.println(arr[0]);       
		System.out.println();
		
		
		int[] array = new int[5];
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+" ");        // default values are 0's when no values assigned.	                                       // if length or size is 5 , 5 default values 0's will assigned
		}
		System.out.println();
		
		
		
		String[] names = new String[5];
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);   // default values are Null when no values values assign to 
		}                                        // String data typed Arrays 
		
		
		double[] doub = new double[5];
		for(int i = 0; i<doub.length;i++) {
			System.out.println(doub[i]);           // default values are 0.0
		}
		
		
		float[] flot = new float[5];
		for(int i = 0; i<flot.length;i++) {
			System.out.println(flot[i]);              //default values are 0.0
		}
		
		
		
		char[] chr = new char[5];
		for(int i =0;i<chr.length;i++) {
			System.out.println(chr[i]);           // default value is an empty space
		}
		
        boolean[] bool = new boolean[5];
        for(int i = 0;i<bool.length;i++) {
        	System.out.println(bool[i]);          // default value is false when no value specifically assigned
        }
		
	}

}
