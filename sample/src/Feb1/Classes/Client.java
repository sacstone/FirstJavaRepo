package Feb1.Classes;

public class Client {

	public static void main(String[] args) {

		Employee ramesh = new Employee();
		ramesh.name = "Ramesh Dhanekula";
		ramesh.id = "12345";
		ramesh.department = "345";
		ramesh.manager = "than";
		ramesh.salary = 120000;
		
		ramesh.yearsInService = 6;
		
		Address rameshAddress = new Address();
		rameshAddress.address1 = "4324 mustic way";
		rameshAddress.address2 = "";
		rameshAddress.city = "Mather";
		rameshAddress.state = "CA";
		rameshAddress.zip = "95655";
		
		ramesh.address = rameshAddress;
		
		boolean a = ramesh.isEligibleForPromotion();
		System.out.println("Is he eligible for promotion? " + a);
		System.out.println(ramesh.salary);
		
		
		
		
		

	}

}
