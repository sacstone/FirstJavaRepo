package jan29.enhancedArrays;

public class Array2D {

	public static void main(String[] args) {
		
		int danialDetails[] = {23, 6};
		int rohanDetails[] = {26, 5};
		//int rajDetails[] = {30, 8};
		
		int studentDetails[][] = {danialDetails,rohanDetails,{30,8}, {44, 7}};
		
		forLoopExample(studentDetails);
		
	}



	public static void forLoopExample(int[][] studentDetails) {
		
		for(int i = 0; i < studentDetails.length; i ++) {
			
			for (int j =0; j < studentDetails[i].length; j++ ) {
				
				if (j == studentDetails[i].length - 1){
				
					System.out.print("Height = " +studentDetails[i][j]);
					break;
				}
				
				System.out.print("Age = "+studentDetails[i][j] + " , ");
				
			}
			System.out.println();
			
			
		}
		
		
	}
	
}
