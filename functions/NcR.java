package functions;
import java.util.*;

public class NcR {
	
	
	
	public static int factorial(int n) {  // function for factorial
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans = ans*i;	
		}
		return ans;
	}
	
	public static boolean isPrime(int n) {  // function for checking prime
		int d=2;
		while(d<n) {
			if(n%d==0) {
				return false;
			}
			d++;
		}
		return true;
	}
	
	public static void printTillN(int n) {
		if(n<=0) {
			return;
		}
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=s.nextInt();
		
		boolean ansPrime=isPrime(13);
		System.out.println(ansPrime);
		
		int num=factorial(n);
		int den1=factorial(r);
		int den2 = factorial(n-r);
		
		
			/*
		int num=1;
		for(int i=1;i<=n;i++) {
			num=num*i;
		}
		int den1=1;
		for(int i=1;i<=r;i++) {
			den1=den1*i;
		}
		int den2=1;
		for(int i=1;i<=n-r;i++) {
			den2=den2*i;
		}
			 */
		int ans=num/(den1*den2);
		System.out.println(ans);
	}
			 

}
