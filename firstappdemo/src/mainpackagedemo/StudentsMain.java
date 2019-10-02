package mainpackagedemo;

public class StudentsMain {
	
	public static void main(String[] args) {
		Students st = new Students("Kene", "Obi", gender.Male);
		System.out.println("First name: " + st.FirstName);
		System.out.println("Last name: " + st.LastName);
		System.out.println("Gender: " + st.gender);
	}

}
