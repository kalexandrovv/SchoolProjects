package paki4;

import java.util.Scanner;

public class Project11Students {

	public Project11Students(String name, double grade) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Project11Students[] students = new Project11Students[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i < 5 ; i++) {
			String name = sc.nextLine();
			double grade = sc.nextDouble();
			sc.nextLine();
			students[i] = new Project11Students (name , grade);
		}
		
		displayStudentsEligible(students);
	}
	public static void displayStudentsEligible(Project11Students students[]) {
		for( Project11Students s : students) {
			if( isStudentEligible(s)) {
				System.out.println(s.name);
			}
		}
	}
	
	 public static boolean isStudentEligible(Project11Students student) {
		 return student.grade > 5.50;
	 }
}
