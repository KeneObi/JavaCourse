package mainpackagedemo;

public class while_do {
	
	public static void main(String[] args) {
		
//		int i = 1;
//		while (i<100) {
//			if (i % 4 == 0) {
//				System.out.println("mode by 4 is: " + i);
//			}
//			i=i+1;
//		}
		int i = 100;
		do {
			if (i % 4 == 0) {
				System.out.println("mode by 4 is: " + i);
			}
			i=i+1;
		} while (i<100);
	}

}
