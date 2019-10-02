package mainpackagedemo;

import java.util.Scanner;

public class SimpleIf {
	
	static Scanner reader=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double grade;
		System.out.println("Grade: ");
		grade = reader.nextDouble();
		
		if((grade>=60) && (grade<=70)) {
			grade = grade + 1;
			System.out.println("\nAdd one, grade is: " + grade);
		}
		else if ((grade>=80) && (grade <= 90)){
			grade= grade + 2;
			System.out.println("\nAdd two, grade is: " + grade);
		}
		else {
			System.out.println("\nCannot add any points");
		}
		
		System.out.println("\nEnd the grading");
	}
 
}
