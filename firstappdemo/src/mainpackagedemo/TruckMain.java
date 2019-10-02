package mainpackagedemo;

public class TruckMain {
	
	public static void main(String[] args) {
		
		Truck.owner = "Smith";
		Truck cartruck = new Truck();
		cartruck.model = 2016;
		cartruck.SetHasTruck(true);
		cartruck.miles = 100;
		cartruck.price = 23330;
		cartruck.type = "GSM";
		System.out.println("Price: " + cartruck.GetPrice());
		cartruck.GetOwner();
	}

}
