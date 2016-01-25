package sample;

public class IndexOfMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[] {1000,0,2,9,300088,6,22, 600};
		
		int minValue = 0;
		int minIndex = num[0];
		
		for (int i = 0; i < num.length; i ++) {
			
			if (num[i] < minValue) {
				minIndex = i;
				
				minValue = num[minIndex];
				
			}
			
		}
		
		System.out.println("Index of Max value = "+ minIndex);

	}

}