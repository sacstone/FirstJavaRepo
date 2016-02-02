package sample;

//used to find some thing in the array
//used to skip some thing from printing, to do that used "continue" statement
//used to get out of the arrray after finding somme thing...used "break"statement

public class JayramArrays {

	public static void main(String[] args) {
		
		int something[] = {5, 6, 0, 89, 709};
		
		boolean has7 = arrayHas7(something);
		
		System.out.println(has7);
		
		breakExample(something);
		continueExample(something);

	}

	public static void breakExample(int[] array) {
		
		for(int i = 0; i < array.length; i ++ ) {
			
			if (array[i] == 0) {
				
				break;
			}
			System.out.println("index [" + i + "]: " + array[i]);
		}
		
		
	}
	
public static void continueExample(int[] array) {
		
		for(int i = 0; i < array.length; i ++ ) {
			
			if (array[i] == 0) {
				
				continue;
			}
			System.out.println("index [" + i + "]: " + array[i]);
		}
		
		
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
