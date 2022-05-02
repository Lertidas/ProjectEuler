import java.util.HashSet;


/* PROBLEM 2 -
Setup a recursive function that will generate fibonacci numbers up to a given limit. As numbers are
generated, will be added to final sum if they are even, (x % 2 == 0) to check for divisibility by 2.
Solved in 0.017 seconds
*/
public class Problem2 {
    public String solve(){
        int limit = 4000000;
        return Integer.toString(evenFibSum(0, 1, limit));
    }
    // Recursive Fibonacci Even values
    private int evenFibSum(int v1, int v2, int limit){
        int v3 = v1 + v2;
        if (v3 <= limit){
            // If even add value to sum
            if (v3 % 2 == 0) {
                return v3 + evenFibSum(v2, v3, limit);
            }
            // Else continue fib without addition
            else {
                return evenFibSum(v2, v3, limit);
            }
        }
        else {
            return 0;
        }
    }
}
