package lecture1;

import java.util.Scanner;

public class RelationJava {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		int j = s.nextInt();
		
		boolean isEql= (i==j) ;
	

		boolean neq= (i!=j) ;
		boolean isgre= (i>j) ;
		boolean isgreq= (i>=j) ;
		boolean isless= (i<j) ;
		boolean islesseq= (i<=j) ;
		
		System.out.println("Is Equal "+ isEql);
		System.out.println("Is not Equal "+ neq);
		System.out.println("Is Greater "+ isgre);
		System.out.println("Is Greater Equal "+ isgreq);
		System.out.println("Is Less "+ isless);
		System.out.println("Is Less Equal "+ islesseq);

		
	}

}
