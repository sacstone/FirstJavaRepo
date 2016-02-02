package jan29.enhancedArrays;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String personDetails[][] = {{"Rohan", "23","6"},{"Daniel", "25", "5"},{"Raj", "20", "4"}};
		
		forLoopExample(personDetails);

	}

	public static void forLoopExample(String[][] personDetails) {
		
		for(int i = 0; i < personDetails.length; i ++) {
			
			for(int j = 0; j < personDetails[i].length; j ++){
				
				if(j == personDetails[i].length-1 ){
					System.out.print(personDetails[i][j]);
					break;
				}
				
				System.out.print(personDetails[i][j] + ":");
			}
			System.out.println();
		}
		
		
	}

}
