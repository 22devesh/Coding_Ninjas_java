package ForLoop;

import java.util.Scanner;

public class practice {
	
	public static int linearSearch(int arr[],int x) {

		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	
	
	while(t-->0) {
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n; i++) {
			arr[i] = sc.nextInt();
			}
		int x = sc.nextInt();
		System.out.println(linearSearch(arr, x));
		 
	}
	sc.close();
}
}
