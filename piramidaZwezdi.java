 package paki4;

import java.util.Scanner;

public class piramidaZwezdi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int zvezdi;
		System.out.println("Enter # of *s on the 1st line : ");
		zvezdi=scanner.nextInt();
		for(int i=0; i<zvezdi; i++) {
			for(int a=0; a<i; a++) {
				System.out.print("  ");
			}
			for(int a=0; a<zvezdi-i; a++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		//scanner.close();
	}

}
