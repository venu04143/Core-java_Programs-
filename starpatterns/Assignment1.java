package com.starpatterns;

public class Assignment1 {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        // Traverse diagonals starting from first row
        for (int k = 0; k < cols; k++) {
            int i = 0;
            int j = k;
            while (i < rows && j >= 0) {
                System.out.print(arr[i][j] + " ");
                i++;
                j--;
            }
            System.out.println();
        }

        // Traverse diagonals starting from last column (excluding first row)
        for (int k = 1; k < rows; k++) {
            int i = k;
            int j = cols - 1;
            while (i < rows && j >= 0) {
                System.out.print(arr[i][j] + " ");
                i++;
                j--;
            }
            System.out.println();
        }
    }
}
		              