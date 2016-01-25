package sample;

public class SearchMinInArray {

	public static void main(String[] args) {
		
		int[] num = {0, 100,45,98,34,-1, 65, -10};
		
		int minValue= num[0];
		
		for(int i = 1; i < num.length; i ++) {
			
			if (num[i] < minValue) {
		
				minValue = num[i];
				//System.out.println(minValue);
			
			}
			
			
			
			
	}
		
		System.out.println(minValue);
		

}
}
