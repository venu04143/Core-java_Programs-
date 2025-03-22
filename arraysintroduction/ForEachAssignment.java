package com.arraysintroduction;

public class ForEachAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		char[] arr = {66,67,68,69};
		for(char i :arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		String[] str = {"Venu","Gopal"};
		for(String i : str) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int nums[] = {1,2,3,4,5,2147483647};
		for(int i :nums) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		byte[] byteArray= {1,2,3,127};
		for(byte b : byteArray) {
			System.out.print(b+" ");
		}
		
		System.out.println();
		
		short[] shortArray= {1,2,3,32767};
		for(short s : shortArray) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		long[] longArray= {1,2,3,9223372036854775807L};
		for(long l : longArray) {
			System.out.print(l +" ");
		}
		
		System.out.println();
		
		double[] doubleArray = {1.5,2.5,3.5,4.5};
		for(double d : doubleArray) {
			System.out.print(d + " ");
		}
		
		System.out.println();
		
		float[] floatArray = {1.2f,2.2f,3.2f,4.2f};
		for(float f : floatArray) {
			System.out.print(f+ " ");
		}
		
		System.out.println();
		
		boolean[] boolArray = {true,false,true,false};
		for(boolean bool : boolArray) {
			System.out.print(bool + " ");
		}
		
	}

}
