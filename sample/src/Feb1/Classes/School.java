package Feb1.Classes;

public class School {

	public static void main(String[] args) {
		
		
		Student thanvi = new Student();
		thanvi.name = "Thanvi";
		thanvi.grade = 6;
		thanvi.score = 99;
		
		Address thanviAddress = new Address();
		thanviAddress.address1 = "3000 Colonial Pkwy";
		thanviAddress.address2 = "";
		thanviAddress.city = "Cedar Park";
		thanviAddress.state = "TX";
		thanviAddress.zip = "78613";
		
		thanvi.address = thanviAddress;
		
		thanvi.printMessage();
		
		
		//new student
		Student ramesh = new Student();
		ramesh.name = "Ramesh Dhanekula";
		ramesh.grade = 8;
		ramesh.score = 90;
		Address rameshAddress = new Address();
		rameshAddress.address1 = "4324 Mustic Way";
		rameshAddress.address2 = "";
		rameshAddress.city = "Mather";
		rameshAddress.state = "CA";
		rameshAddress.zip = "95655";
		
		ramesh.address = rameshAddress;
		
		ramesh.printMessage();
		
		Loan amount = new Loan();
		double r = amount.loan(20000, 2.5, 20000, 6);
		System.out.println(r);
		
		
		

		
		
	

	}

}
