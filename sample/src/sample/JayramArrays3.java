package sample;

public class JayramArrays3 {
	
	
	public static void main(String[] args) {
		
		
		//System.out.println(numberBetween(27, 2, 200)); 
		
		boolean result = numberBetween(270, 2, 2000);
		
		System.out.println(result);
		
		
		
		
	}

	private static boolean numberBetween(int i, int j, int k) {

		if (i >=j && i <= k) {
			
			return true;
		}
		
		return false;
		
	}
	
	

}
