package mainpackagedemo;

public class InnerClass {
	
	static class Animal{
		String name;
		String voice;
	}
	
	public static void main(String[] args){
		Animal animal = new Animal();
		animal.name = "Monkey";
		animal.voice = "hehe";
		System.out.println(animal.name);
	}
	
	void call() {
		
	}

}
