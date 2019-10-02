package mainpackagedemo;


//Generic Method. Using <"name">, we can call a function with any type of arguments
//Generic class: same but for classes. "<M,N>" below

public class generic<M,N> {
	
	public static void main(String[] args) {
		
		String[] a1 = {"Kene", "Dan", "Alex"};
		Integer[] a2 = {1,2,34,5,2,2};
		Double[] a3 = {3.4, 7.6, 5.2};
		print(a1);
		print(a2);
		print(a3);
	}
	
	static <T> void print(T[] ar) {
		for(T s: ar) {
			System.out.println(s);
		}
	}

}
