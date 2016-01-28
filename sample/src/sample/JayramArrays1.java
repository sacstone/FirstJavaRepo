package sample;

public class JayramArrays1 {

	public static void main(String[] args) {


		int something[] = {1, 2, 58, 58,49};
		
		printSameAsArray(something);

	}

	public static void printSameAsArray(int[] array) {
		
		System.out.print("{ ");
		// TODO Auto-generated method stub
		
		for(int i = 0; i < array.length; i ++) {
			
			System.out.print(array[i]+ " ");
		}
		System.out.print("}");
		
	}
	

	

}
