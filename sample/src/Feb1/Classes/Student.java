package Feb1.Classes;

public class Student {
	
	String name;
	int grade;
	int score;
	Address address;
//	String address1;
//	String address2;
//	String city;
//	String state;
//	String zip;
	
	public void printMessage() {
		
		if(grade >=6 && score > 70) {
			
			System.out.println("Well done " + name + " , We will ship your gift to:");
			address();
			
					

		}
		
		
		
	}
	
	public void address() {
		
		System.out.println(address.address1 + " "+ address.address2 + "\n" +address.city + ", " + address.state + ", " + address.zip);
	}
	

}
