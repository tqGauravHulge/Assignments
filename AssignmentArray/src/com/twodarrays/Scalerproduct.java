package com.twodarrays;

class GFG {

	static final int num = 3;

	static void scalarProductMat(int mat[][], int k) {
		for (int i = 0; i < num; i++)
			for (int j = 0; j < num; j++)
				mat[i][j] = mat[i][j] * k;
	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int k = 4;

		scalarProductMat(mat, k);

		System.out.println("Scalar Product Matrix is : ");

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}
}