package recursion;

public class factorial {

	public static int fact(int n){

        //base case:-
        if( n == 0){
            return 1;
        }
        
        int smallAns = fact(n-1);
        return n*smallAns;
    }

    public static void main(String[] args) {
        
        int n =5;
        int ans = fact(n);
        System.out.println(ans);
    }
} 

