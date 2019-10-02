package mainpackagedemo;

public class operations {
	/*
	 * 0 - ()
	 * 1 - (--,++, before)
	 * 2- ^
	 * 3- division and multiplication
	 * 4- sum and subtract
	 * 5- =
	 * 6 - (--,++ after)
	 */
	public static void main(String[] args)
	{
		int n1 = 5;
		int n2 = 10;
		int n3 = 4;
		//Raising to a power. Use Math.pow(no,index)
		//double sum = Math.pow(4, 2); //n1-n2+n3*3;
		int sum = (++n1 +n2)*n3;
		
		System.out.println(n1);
		System.out.println("sum: "+ sum);
	}

}
