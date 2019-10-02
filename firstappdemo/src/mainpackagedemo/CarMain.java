package mainpackagedemo;

public class CarMain {
	
	public static void main(String[] args) {
		
		Car.owner = "Smith";
		Car car1=new Car("BMW", 2016, 10000, 5);
//		car1.type = "BMW";
//		car1.model = 2016;
//		car1.price = 10000;
//		car1.miles = 5;
		
		double realPrice = car1.GetPrice();
		System.out.println("Owner: "+Car.owner);
		System.out.println("Car 1 price: " + realPrice);
		
		
		Car car2=new Car();//"BMW", 2015, 9000, 15);
		car2.type = "BMW";
		car2.model = 2015;
		car2.price = 9000;
		car2.miles = 15;
//		car2.owner = "Smith";
		
		double realPrice2 = car2.GetPrice();
		System.out.println("Owner: "+Car.owner);
		System.out.println("Car 2 price: " + realPrice2);
	}

}
