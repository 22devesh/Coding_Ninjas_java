package Array;

import java.util.Scanner;

public class ArrayUse {

	public static void print(int[][] input) {
		int rows = input.length;
		int cols = input[0].length;
			
		for(int i =0; i<rows; i++) {
			for(int j = 0; j<cols;j++) {
				System.out.println(input[i][j]+ " ");
			}
			System.out.println();
		}
	public static void main(String[] args) {
		
		int arr2[][] = {{1,2,3},{4,5,6}};
		print(arr2);
//		int arr2[][] = {{1,2,3},{4,5,6}};
//		System.out.println(arr2);
//		System.out.println(arr2.length);
//		for(int i = 0; i<2; i++) {
//			System.out.println(arr2[i].length);
			
		}
			
		
//		ijnt arr2d[][] = new int[3][4];
//		System.out.println(arr2d[1][2]);
//		arr2d[2][0] =15;
//		System.out.println(arr2d[2][0]);
		
		
	    
//		Scanner s =new Scanner(System.in);
//		System.out.println("Enter number of rows: ");
//		int rows = s.nextInt();
//		System.out.println("Enter no of columns: ");
//		int cols = s.nextInt();
//		int input[][] = new int[rows][cols];
//		for(int i=0; i<rows; i++) {
//			for(int j=0;j<cols;j++) {
//				System.out.println("Enter element at "+i+" rows and "+j+" column");
//				input[i][j] = s.nextInt();
//			}
//		}
//		for(int i=0; i<rows; i++) {
//			for(int j=0;j<cols;j++) {
//				System.out.print(input[i][j]+" ");
//			}
//			System.out.println();
//			}
	}
}  

	
	