package sample;

public class JayramArrays {

	public static void main(String[] args) {
		
		int something[] = {5, 6, 89, 709};
		
		boolean has7 = arrayHas7(something);
		
		System.out.println(has7);

	}

	public static boolean arrayHas7(int[] array) {
		
		for(int i = 0; i < array.length; i ++) {
			
			if (array[i] == 7 ) {
				return true;				
			}
		}
		
		return false;
	}

}
