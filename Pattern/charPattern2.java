/*
 pattern like:-
ABCD
BCDE
CDEF
DEFG
 */
import java.util.Scanner;

public class charPattern2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			char startingChar= (char)('A'+i-1);
			while(j<=n) {
				System.out.print(startingChar);
				startingChar=(char)(startingChar + 1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
