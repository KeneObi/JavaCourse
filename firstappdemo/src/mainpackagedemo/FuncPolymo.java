package mainpackagedemo;

// Same function, same name, different input types
// global variables: You have access from anywhere in the code. can be called in the function or main

public class FuncPolymo {
	
	static double pi = 3.5; //global variable
	
	
	double div(double n1, double n2) {
		double r = n1/n2; // local variable. Only accessed in the function
		return r;
	}
	
	double div(int n1, int n2) {
		double r = n1/n2*2;
		return r;
	}
	
	public static void main(String[] args) {
		
		double r = new FuncPolymo().div(10.0,5.0);
		System.out.println(r);
		
		r = new FuncPolymo().div(20,4);
		System.out.println(r);
	}

}
