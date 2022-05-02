import java.util.HashSet;


/* PROBLEM 1 -
Create HashSet to store all values under 100 that are multiples of 3 or 5. Loop through all multiples
of 3 first up to limit, then for multiples of 5 up to limit. Finally add all values in HashSet.
Solved in 0.001 seconds
*/
public class Problem1 {
    public String solve(){
        int limit = 1000;
        int sum = 0;
        HashSet<Integer> multiples = new HashSet<>();
        // Get multiples of 3
        for(int i = 3; i < limit; i += 3){
            multiples.add(i);
        }
        // Get multiples of 5
        for(int i = 5; i < limit; i += 5){
            multiples.add(i);
        }
        // Get sum of values
        for(Integer i : multiples){
            sum += i;
        }
        // Return value
        return Integer.toString(sum);
    }
}
