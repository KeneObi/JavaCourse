package mainpackagedemo;

public class FunctionSimple {
	
	// void means it returns nothing, () means no input arguments, static so you can just call draw()
	static void Draw() {
		for(int i = 0; i<10; i++) {
			System.out.println("*");
			for(int j=i; j>=0; j--) {
				System.out.print("-");
			}
		}
	}
	
	float sum(float n1, float n2) {
		float sum = n1 + n2;
		return sum;
	}
	
	public static void main(String[] args){
		
		//new FunctionSimple().Draw(); for when the function is not static
		
		Draw();
		
		float sum = new FunctionSimple().sum(1,2);
		System.out.println("\n" + sum);
		}
}
