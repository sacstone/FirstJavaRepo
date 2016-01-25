package sample;

public class SomeOfArrayElements {

	public static void main(String[] args) {
		
		

		int[] num = {100, 200, 300, 400, 500};
		
		int sum = 0;
		
		for(int i = 0; i<num.length; i ++) {
			
			sum = sum + num[i];
			
			
		}
		
		System.out.println("Sum of Array is : " + sum);
		
		
		

	}

}
