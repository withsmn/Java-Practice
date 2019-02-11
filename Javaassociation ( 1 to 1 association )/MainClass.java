package Javaassociation;

public class MainClass {

	public static void main(String[] args) {
		Student s1 = new Student("Sumon","22");
		PostalAddress pal = new PostalAddress("1353", "Central road", "Dhaka", "1236");
		s1.setAddress(pal);
		System.out.println(s1.getAddress().getCity());
		
		
		
		
		

	}

}
