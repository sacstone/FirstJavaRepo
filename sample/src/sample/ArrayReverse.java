package sample;

import java.io.*;


public class ArrayReverse {
	
	public static void main(String[] args) throws IOException{
	
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);
	
	String inData;
	int num1;
	
	int [] num = new int[10];
	
	for(int i = 0 ; i < 10; i ++) 
	{
		
		int r = i+1;
		
		System.out.println("Enter Number " + r + " :");
		
		inData = stdin.readLine();
		num1 = Integer.parseInt(inData);
		
		num[i] = num1;
		
		
	}
	
	System.out.println( num[9]+ " "+ num[8]+ " " +num[7]+ " " +num[6]+ " "+num[5]+ " "+num[4]+ " "+num[3]+ " "+num[2]+ " "+num[1]+ " "+num[0]+ " ");
	
	
	
		
	
		
		
		
		
	}
	

}
