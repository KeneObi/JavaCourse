package mainpackagedemo;

public class StringFile {
	
	public static void main(String[] args) {
		
		String name = "Kene Obi";
		
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(name.length()-1));
		
		for (int i = name.length()-1; i>=0; i--) {
			
			System.out.print(name.charAt(i));
		}
		System.out.print("\n\n");
		//splitting text into an array and printing on different lines
		String text = "He goes home in the morning";
		String[] splittext = text.split(" ");
		for(int i = 0; i < splittext.length; i++) {
			System.out.println(splittext[i]);
		}
	}
//	System.out.println(text);

}
