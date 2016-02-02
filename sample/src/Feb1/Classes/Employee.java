package Feb1.Classes;

public class Employee {
	String name;
	String id;
	String department;
	String manager;
	static int salary;
	Address address;
	String approver;
	static int yearsInService;
	
	public static boolean isEligibleForPromotion(){
		
		if (yearsInService > 5) {
			salary = salary * 2;
			
			return true;
			
		}
		return false;
		
	}
	

}
