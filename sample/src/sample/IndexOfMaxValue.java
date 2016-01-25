package sample;

public class IndexOfMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[] {1000,0,2,9,300088,6,-1,22, 600};
		
		int maxValue = 0;
		int maxIndex = num[0];
		
		for (int i = 0; i < num.length; i ++) {
			
			if (num[i] > maxValue) {
				maxIndex = i;
				
				maxValue = num[maxIndex];
				
			}
			
		}
		
		System.out.println("Index of Max value = "+ maxIndex);

	}

}
