package Array;

import java.util.Scanner;

public class larcolsum {

	public static int[][] takeInput() {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the num of rows ");
		int rows = s.nextInt();
		System.out.println("Enetr num of cols ");
		int cols = s.nextInt();
		int input[][] = new int[rows][cols];
		
		for(int i = 0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter the element at "+i +"row "+ j+"col");
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static int largestcolsum(int input[][]) {
		int largest = Integer.MIN_VALUE;
		int rows = input.length;
		int cols = input[0].length;
		
		for(int j = 0; j<cols;j++) {
			int sum =0;
			
			for(int i= 0 ; i<rows;i++) {
				sum += input[i][j];	
			}
			if(sum > largest) {
				largest = sum;
				
			}
		}
		return largest;
	}
	public static void main(String[] args) {

		int input[][] = takeInput();
//		print(input);
		System.out.println("Largest col sum "+largestcolsum(input));

	}
}
	


