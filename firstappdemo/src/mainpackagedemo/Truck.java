package mainpackagedemo;


// Inheritance: when a class has properties and methods already in another class
// Just use "extend" instead of writing everything again


// Encapsulation: limit access to some variables using public, private and protect
// can only access it from the constructor i.e Car("...") when private
// protected means you dont have direct access but can get it from inheritance

public class Truck extends Car {
	
	
	// Properties
	private boolean hasTruck; // private means you can only access it inside the class
	
	public void SetHasTruck(boolean hasTruck) {
		this.hasTruck = hasTruck;
	}
	
	public Truck() {
		System.out.println("Constructor of car truck");
	}
	
	
	void GetOwner() {
		System.out.println("Owner: " + owner);
		System.out.println("Price: " + super.GetPrice());
	}
	
	@Override // this will help you know if you are really overriding the method
	double GetPrice() {
		// different content
		double NewPrice = price - (miles*50);
		return NewPrice;
	}

}
