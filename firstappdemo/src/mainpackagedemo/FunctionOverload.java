package mainpackagedemo;

//Overload: same function with different number of parameters

public class FunctionOverload {
	
	float sub(float n1, float n2) {
		float result = n1-n2;
		return result;
	}
	
	
	// dont need same type of parameters e.g. float
	float sub(float n1, float n2, float n3) {
		float result = n1-n2-n3;
		return result;
	}
	
	public static void main(String[] args){
		
		float r = new FunctionOverload().sub(28,12);
		System.out.println(r);
		
		float r1 = new FunctionOverload().sub(28,12,3);
		System.out.println(r1);
	}

}
