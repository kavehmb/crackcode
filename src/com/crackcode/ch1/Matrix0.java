package com.crackcode.ch1;

public class Matrix0 {

	public static void main(String[] Args) {

		int[][] matrix3 = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 } };
		int[][] matrix4 = { { 11, 0, 13, 14 }, { 21, 22, 23, 24 },
				{ 31, 32, 33, 34 }, { 0, 42, 43, 44 } };
		int[][] matrix42 = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 } };

		// printMatrix(matrix42);
		printMatrix(matrix4);

		printMatrix(zeroMatrix(matrix4));
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static int[][] zeroMatrix(int[][] matrix) {
		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}

			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (row[i] == 1 || col[j] == 1)
					matrix[i][j] = 0;

			}
		}

		return matrix;

	}

}
