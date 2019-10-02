package mainpackagedemo;

import java.util.Scanner;

public class SwitchFile {
	
	static Scanner reader=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Index: ");
		int index=reader.nextInt();
		switch(index)
		{
		case 1:
			System.out.println("\nMale");
			break;
		case 2:
			System.out.println("\nFemale");
			break;
		default:
			System.out.println("\nUnknown");
				
		}
		
	}

}
