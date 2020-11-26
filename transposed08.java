package paki4;

import java.util.Scanner;

public class transposed08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number on raws ");
		int rawSize = sc.nextInt();
		System.out.println("Enter a number on columns ");
		int columnSize = sc.nextInt();
		int[][] matrix = new int [rawSize] [columnSize];
		int[][] transposed = new int [columnSize] [rawSize];
		for(int i = 0; i<rawSize; i++) {
			for(int j = 0 ;j < columnSize; j++) {
				System.out.println("Enter a number on index " + i + ", " + j);
			}
		}
		for (int i=0; i <rawSize;i++) {
			for(int j=0; j < columnSize; j++) {
				System.out.print( matrix [i][j] + "\t");
			}
			System.out.println();
		}
		for (int i=0; i <rawSize;i++) {
			for(int j=0; j < columnSize; j++) {
				transposed[j][i] = matrix[i][j];
				}
			}
		System.out.println("Transposed : \n");
		for(int i = 0 ; i < columnSize; i++) {
			for(int j = 0 ; j < rawSize;j++) {
				System.out.print( transposed[i][j] + "\t");
			}
			
			System.out.println();
		}
		
	}

}
