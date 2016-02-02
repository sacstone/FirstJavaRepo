package sample;

//Reprint the Array same way it is declared with values;

//Used Break to get out of last "," that is used to print element in the loop

//Example of ternary operator...

public class JayramArrays2 {

	public static void main(String[] args) {
		
		int something[] = {2, 3, 6,96,77,4, 5, 6,7};
		
		reprintArray(something);
		
		
		int a = 9; 
		int b = 7;
		//Ternary operator example;
		String c = (a > b) ? "This is true": "This is falsee";
		System.out.println("\n" +c);
		
		

	}

	public static void reprintArray(int[] array) {
		System.out.print("{");
		
		for(int i = 0; i < array.length; i++){
			
			if (i == array.length -1){
				System.out.print(array[i]);
				
				break;
			}
			
			System.out.print(array[i] + ",");
			
			
		}
		System.out.print("}");
	}

}
