package com.arraysintroduction.twodimentionalarray;

public class Char2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] ch = new char[2][2];
		ch[0][0] =65;
		ch[0][1] =66;
		ch[1][0] =67;
		ch[1][1] =68;
		
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]+ " ");
			}
			System.out.println();
		}
		                        //0            1            2
		                    //0  1   2     0   1   2   3     0   1   2   
		char[][] char2D = {{'A','B','C'},{'M','N','O','P'},{'X','Y','Z'}};
		                        //3           4                3
		for(int i=0;i<char2D.length;i++) {
			for(int j=0;j<char2D[i].length;j++) {
				System.out.print(char2D[i][j]+ "  ");
			}
			System.out.println();
		}
		
		
		for(char[]char1D :char2D) {
			for(char chr : char1D) {
				System.out.print(chr+ "  ");
			}
			System.out.println();
		}
 	}
	

}
