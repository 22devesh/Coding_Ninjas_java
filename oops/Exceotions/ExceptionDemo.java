package Exceotions;


public class ExceptionDemo {

	public static int fact(int n) {
		if(n<0) {
			throw NegativeNumberException();
		}
		int ans = 1;
		for(int i = 2; i<=n ; i++) {
			ans = ans *i;
		}
		return ans; 
	}
	public static int divide(int a, int b) throws DivideByZeroException{
		if(b == 0) {
			throw new DivideByZeroException();
//			throw new ArithmeticException();
			
	}
		return a/b;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s =null;
//		System.out.println(s.length());
//		System.out.println(4/0);
//		System.out.println("Main");
		
		try {
			divide(10, 5);
			System.out.println("Within Try");
			
		}catch(DivideByZeroException e) {
			//TODO Auto-generated catch block
			System.out.println("Divide by zero exception raise");
//			e.printStackTrace();
		}
		System.out.println("Main");
	}

}
