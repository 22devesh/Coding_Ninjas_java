package lecture1;
import java.util.Scanner;

public class simpleinterestcalculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
	
	String str = s.nextLine();
	
	
	char c= str.charAt(0);
	System.out.println();
	
	int p= s.nextInt();
	int r=s.nextInt();
	int t= s.nextInt();
	int si =(p*r*t)/100;
	
	
	long l= s.nextLong();
	
	float f= s.nextFloat();
	double d= s.nextDouble();
	System.out.println(si);
}
}



