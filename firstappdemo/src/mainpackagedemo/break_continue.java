package mainpackagedemo;

public class break_continue {
	
	public static void main(String[] args) {
		
		for (int i = 1; i<100; i++) {
			if (i % 4 == 0) {
//				continue; //ignore the rest of the for loop, increase i and continue
				break;
			}
			System.out.println("Count: " + i);
		}
	}

}
