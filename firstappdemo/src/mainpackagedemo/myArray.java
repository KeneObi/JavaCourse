package mainpackagedemo;

import java.util.Scanner;

public class myArray {
	
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String[] jobs = new String[5];
//		jobs[0] = "Developer";
//		jobs[1] = "Tester";
//		jobs[2] = "QA";
//		jobs[3] = "Manager";
//		jobs[4] = "Admin";
		
		System.out.println("Enter jobs: ");
		for (int i = 0; i < 5; i++) {
			jobs[i] = reader.nextLine();
		}
		System.out.println("print jobs");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(jobs[i]);
		}
	}

}
