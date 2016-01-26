package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReverseTwo {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(inStream);
		
		String inData;
		
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i ++) {
			
			int r = i +1;
			
			System.out.println("Enter Number"+ r+ ":");
			
			inData = stdin.readLine();
			int num1 = Integer.parseInt(inData);
			num[i] = num1;
			
			//System.out.print(num[i]);
			
		}
		
		System.out.println("   ");
		System.out.println("==============");
		System.out.println("   ");
		System.out.println("Numbers in Reverse Order is : ");
		System.out.println("   ");
		
		for (int i = num.length-1; i >=0; i --) {
			
			System.out.print(num[i] + " ");
		}

	}
	
	
	
	
	

}
