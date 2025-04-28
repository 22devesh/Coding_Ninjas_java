package functions;
import java.util.*;
public class increment {
	
	public static int divide(int num,int deno) {
		
		if(deno==0) {
			return Integer.MIN_VALUE;
		}
		return num/deno;
//		n=n+1;
		
	}
	public static void printDivisionResult(int num,int deno) {
		if(deno==0) {
			//exit the function
			System.out.println("Division by Zero is not allowed");
			return;
		}
		System.out.println(num/deno);
		
		
	}

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int deno= sc.nextInt();
	printDivisionResult(num, deno);
//	int result= divide(num, deno);
//	System.out.println(result);
//		int a=10;
//		increment(a);
//		System.out.println(a);
//	}
	
	
	
}
}
