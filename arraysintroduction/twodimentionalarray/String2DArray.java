package com.arraysintroduction.twodimentionalarray;

public class String2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] str = new String[2][3];

		str[0][0] = "Venu";
		str[0][1] = "Pranay";
		str[0][2] = "Eshwar";
		str[1][0] = "Luckey";
		str[1][1] = "Vyshu";
		str[1][2] = "Hani";

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}

		String[][] str1 = {

				{ "V", "E", "N", "U" }, { "G", "O", "P", "A", "L" }, { "O", "N", "T", "I", "P", "U", "L", "I" }

		};
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				System.out.print(str1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
