package Array;
import java.util.*;
public class arr1 {

	public static void main(String[] args) {
		int arr[] =new int[10];
//		arr[3] = 15;
		
//		System.out.println(arr[3]);
//		System.out.println(arr[3]);
//
//		char chArray[] = new char[11];
//		chArray[0] ='a';
//		double dArray[] = new double[12];
//		dArray[0]=1.2;
//		System.out.println(chArray[0]) ;
//		System.out.println(dArray[0]);
		
		
		
		// Taking input from user and print the array
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i=0;i<size;i++) {
			input[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(input[i]+" ");
		}
	}

}
