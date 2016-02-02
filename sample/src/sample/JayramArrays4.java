package sample;

//import java.util.Arrays;

//This is to sort the arrays...

public class JayramArrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare an array
		
		int values[] = {4, 1, 200, 4,5, 207};
		
		theBreakExample(values);
		theContinueExample(values);
		

	}

	public static void theContinueExample(int[] values) {
		
		System.out.print("\nResult of continue: [");
		
		for(int i =0; i < values.length; i++){
			if(values[i] == 4) {
				continue;
			}
			System.out.print(values[i] + " ");
		}
		System.out.print("]");
	}

	public static void theBreakExample(int[] values) {
		System.out.print("\nResult of Break: [");
		for(int i = 0; i < values.length; i ++) {
			if(values[i] == 1) {
				break;
			}
			System.out.print(values[i] + " ");
			
		}System.out.print("]");
		
	
		
	}

}
