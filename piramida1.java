package paki4;

import java.util.Scanner;

public class piramida1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int piramidaRows;
		System.out.println("Enter # of rows in the pyramid : ");
		piramidaRows=scanner.nextInt();
		while(piramidaRows>0) {
			for(int a=piramidaRows; a>=1; a--) {
				System.out.print(a + " ");
			}
			for(int a=2; a<=piramidaRows; a++) {
				System.out.print(a + " ");
			}
			System.out.print("\n");
			piramidaRows--;
		}
		//scanner.close();
	}

}