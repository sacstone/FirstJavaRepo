package sample;

public class IndexOfMinimumValue {

	public static void main(String[] args) {
		
		int[] value = {0, 4, 1, 9, 2, 9, 7};
		int minIndexValue = 0;
		for(int i = 1; i < value.length; i ++) {
			
			if (value [i] < value [minIndexValue]) {
				
				minIndexValue = i;
				
				
				
			}
			
			
		}
		System.out.println(minIndexValue);
		

	}

}
