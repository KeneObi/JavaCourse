package mainpackagedemo;

public class convert {
	public static void main(String[] args)
	{
		int age = 27;
		double salary = 3.5;
		boolean istrue = false;
		String rate="3.5"; 
		
		//convert to string. String.valueof()
		String newsalary = String.valueOf(salary);
		String newage = String.valueOf(age);
		String newistrue = String.valueOf(istrue);
		
		//convert to integer using Integer.parseInt for text-number
//		int newrate = Integer.parseInt(rate);
		//using casting for number-number
		int newsalary1 = (int)salary;
		
		//convert to double for text-number
		double newrate1 = Double.parseDouble(rate);
		//casting for number-number
		double newage1 = (double)age;
	}
	

}
