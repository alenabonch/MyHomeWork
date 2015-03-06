package homework2;

import java.util.Arrays;

public class MatrixMultiplication { 
	
	public static void main(String[] args) {
		double[][] a = new double[4][3];
		double[][] b = new double[3][5];
		double[][] c;
		fillWithRandoms(a);
		fillWithRandoms(b);
		System.out.println("Matrix A = ");
		printMatrix(a);
		System.out.println("Matrix B = ");
		printMatrix(b);
		System.out.println("Matrix A*B = ");
		c = multiplyMatrixes(a, b);
		printMatrix(c);
	}

	private static double[][] multiplyMatrixes(double[][] a, double[][] b) {
		if (a[0].length == b.length) {
			double[][] result = new double[a.length][b[0].length];
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
					result[i][j] = calculateElement(a, b, i, j);
				}
			}
			return result;
		} else {
			System.out.println("This matrixes can't be multiplied");
			return null;
		}
		
	}

	private static double calculateElement(double[][] a, double[][] b, int iIndex, int jIndex) {
		double element = 0;
		for (int i = 0; i < b.length; i++) {
			element = element + a[iIndex][i]*b[i][jIndex];
		}
		return element;
	}

	private static void fillWithRandoms(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Math.random() * 10;
			}
		}		
	}
	
	private static void printMatrix(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
