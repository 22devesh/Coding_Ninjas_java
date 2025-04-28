package Array2D;

import java.util.Scanner;

import sorting.input;

public class arrayuse {

	public static void main(String[] args) {
		// int arr2d[][] = new int[3][4];
		// System.out.println(arr2d[1][2]);
		// arr2d[2][0] =15;
		// System.out.println(arr2d[2][0]);
		
//		int arr2[][] = {{1,2,3},{4,5,6}};

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int rows=sc.nextInt();
		System.out.println("Enter no. of cols");
		int cols=sc.nextInt();
		int input[][]=new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.println("Enetr element at "+i+" row "+j+" col");
				input[i][j]=sc.nextInt();
			}
		}
	
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			System.out.print(input[i][j]+" ");
		}
		System.out.println();
	}
	}
}

