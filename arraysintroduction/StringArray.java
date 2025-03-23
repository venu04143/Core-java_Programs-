package com.arraysintroduction;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Adiseshu","Venkayamma","VenuGopal","DhanaLakshmi","Annapurna"};
		
		for(int i =0;i<names.length;i++) {
			if(names[i].contains("V") || names[i].startsWith("A") || names[i].endsWith("i")) {
		   System.out.print(names[i] +" ");
		}
		}
	}

}
