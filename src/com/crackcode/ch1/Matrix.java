package com.crackcode.ch1;

public class Matrix {

	public static void main(String[] Args) {

		int[][] matrix3 = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 } };

		printMatrix(matrix3);
		printMatrix(rotate(matrix3));

		int[][] matrix2 = { { 11, 12 }, { 21, 22 } };

		printMatrix(matrix2);
		printMatrix(rotate(matrix2));

	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");

		}
	}

	public static int[][] rotate(int[][] matrix) {
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; layer++) {
			for (int traverse = layer; traverse < n - layer - 1; traverse++) {

				int top = matrix[layer][traverse];
				int left = matrix[n - 1 - traverse][layer];
				int right = matrix[traverse][n - 1 - layer];
				int bottom = matrix[n - 1 - layer][n - 1 - traverse];

				matrix[layer][traverse] = left;
				matrix[traverse][n - 1 - layer] = top;
				matrix[n - 1 - layer][n - 1 - traverse] = right;
				matrix[n - 1 - traverse][layer] = bottom;

			}
		}
		return matrix;
	}
}
