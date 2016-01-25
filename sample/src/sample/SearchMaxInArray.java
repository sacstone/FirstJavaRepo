package sample;

public class SearchMaxInArray {

	public static void main(String[] args) {
		
		int[] num = {100,45,98,34,65};
		
		int maxValue= num[0];
		
		for(int i = 1; i < num.length; i ++) {
			
			if (num[i] > maxValue) {
		
			maxValue = num[i];
			
			}
			
			
			
			
	}
		
		System.out.println(maxValue);
		

}
}