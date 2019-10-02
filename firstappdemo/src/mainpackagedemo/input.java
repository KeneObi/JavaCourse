package mainpackagedemo;

import java.util.Scanner;

public class input {
	
	static Scanner reader = new Scanner(System.in);
	static Scanner reader1 = new Scanner(System.in);

	public static void main(String[] args) { 
		System.out.print("What is your name? ");
		String name;
		name = reader.nextLine();
		System.out.print("Age: ");
		int age = reader.nextInt();
		System.out.print("Salary? ");
		double salary = reader.nextDouble();
		System.out.print("Gender: ");
		String input = reader1.nextLine();
		char gender = input.charAt(0);//charAt(i) to read the value at the ith position of string
		
		System.out.println("");
		System.out.println("Name: "+name);
		System.out.println("Age: " +age);
		System.out.println("Salary: " + salary);
		System.out.println("Gender: "+gender);
		
		//float pi = 3.5f;
	}


}
