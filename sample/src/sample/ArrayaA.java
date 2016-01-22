package sample;

import java.io.*;

public class ArrayaA {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(inStream);
		
		String inData;
		double sum = 0;
		
		double[] num = new double[10];
		
		for (int i = 0; i < 10; i ++) {
			
			int r = i +1;
			
			System.out.println("Enter Number " +r+ " : "); 
			inData = stdin.readLine();
			double num1 = Double.parseDouble(inData);
			
			num[i] = num1;
			sum = sum + num[i];
		}
		
		double ave = (sum/10);
		System.out.println("Average of Array is : " + ave);
		

	}

}
