package mainpackagedemo;

//Casting: Changing an instance of one class to an instance of another class
// only info shared by both classes are carried over. If any method/property has been overwritten, the new one is carried over. 
public class Casting {
	
	public static void main(String[] args) {
		
		Truck.owner = "Smith";
		Truck cartruck = new Truck();
		cartruck.model = 2016;
		cartruck.SetHasTruck(true);
		cartruck.miles = 100;
		cartruck.price = 23330;
		cartruck.type = "GSM";
//		cartruck.GetOwner();
		Car MyCar = (Car) cartruck;
		System.out.println(MyCar.miles);
	}

}
