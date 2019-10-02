package mainpackagedemo;

public class Car { //add "abstract" at the beginning to make it only accessible by inheritance
	
	// Properties
	public String type;
	protected int model;
	public double price;
	public double miles;
	
	// static means all the instances will use this property
	static String owner;
	
	// aggregation: instance of one class in another class
	owners owners;
	
	// Constructor - ALways same name as the class. Always called when an instance is created, no need to call it
	// so you dont need to start writing everything out when creating an instance
	
	public Car(String type, int model, double price, double miles) {
		
		// use "this" to show it the "Type" variable in this class since there are two "type"s
		this.type = type;
		this.model = model;
		this.price = price;
		this.miles = miles;
//		this.owner = owner;
		System.out.println("Constructor 1 is created");
		owners = new owners();
		owners.FirstName = "Kene"; // aggregated from the owners class
	}
	
	public Car() {
		System.out.println("Constructor 2 is created");
	}
	
	//Method
	double GetPrice() {
		double NewPrice = price - (miles*100);
		return NewPrice;
	}

}
