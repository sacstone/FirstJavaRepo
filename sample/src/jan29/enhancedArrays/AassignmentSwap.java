package jan29.enhancedArrays;

public class AassignmentSwap {

	public static void main(String[] args) {
//		int a = 40;
//		int b = 20;
//		System.out.println("a: "+a);
//		System.out.println("b: "+b);
//		
//		System.out.println("============");
//		
//		int temp;
//		temp = b;
//		System.out.println("a: " +temp);
//		
//		b =a;
//		System.out.println("b: " +b);
		
//		int a = 20;
//		int b = 30;
//		
//		System.out.println("Value of a , b before swap is a: " + a+ " b: " + b);
//		a = a + b;//50
//		b = a -b;//20
//		a = a - b;//30
//		
//		System.out.println("Value of a , b before swap is a: " + a+ " b: " + b);
//		
		
		int a = 10;
		int b = 20;
		
		swapTwoNumbers(200, 50);
			
		
	}

	private static void swapTwoNumbers(int i, int j) {

		System.out.println("Before swap:");
		System.out.println("Value of x: " + i);
		System.out.println("Value of y: " + j);
		
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println(" ");
		System.out.println("After swap:");
		System.out.println("Value of x: " + i);
		System.out.println("Value of y: " + j);
		
		
		
	}

}
