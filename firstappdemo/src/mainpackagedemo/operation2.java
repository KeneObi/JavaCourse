package mainpackagedemo;


// can also inherit a class while at it
// to implement more than one interface, just separate the names by a comma
public class operation2 extends Car implements operation {

	@Override
	public int sum(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1+n2)*2;
	}

	@Override
	public int sub(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1-n2)*2;
	}

	@Override
	public double div(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1/n2*2;
	}

	@Override
	public int mul(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1*n2*2;
	}
	
	

}
