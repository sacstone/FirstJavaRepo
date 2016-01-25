package sample;

public class ArraySearch {

	public static void main(String[] args) {
		
		int[] age = {12, 15, 25, 36, 66};
		
		int target = 66;
		
		for (int i = 0; i < age.length; i ++) {
			
			if (age[i] == target) {
				
				System.out.println(i);
			} 
			
			
		}
		
		
		
 
	}
	
	
	public int SearchArray(int[] num, int target) {
		
		for (int i = 0; i > num.length; i ++)
			
			if (num[i] > target) {
				
				return i;
			}
		return -1;
		
	}

}
