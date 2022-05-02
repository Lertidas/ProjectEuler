/*
Solve for largest prime factor by first dividing val by 2's. Next continue checking if odd numbers
divide into val, if so divide, else increase odd number. Once odd number is greater than or equal to
val return largest prime factor.
Solved in 0.007 seconds
 */
public class Problem3 {
    public String solve(){
        long value = 600851475143L;
        return Long.toString(largestPrimeFactor(value));
    }

    // Obtain largest prime factor
    private int largestPrimeFactor(long val) {
        int factor = 2;
        int actualFactor = factor;
        // Remove factors of 2
        while (factor <= val && val % 2 == 0) {
            val /= 2;
        }
        factor += 1;
        if (factor <= val) {
            while (factor <= val) {
                if (val % factor == 0) {
                    val /= factor;
                    actualFactor = factor;
                } else {
                    factor += 2;
                }
            }
        }
        return actualFactor;
    }
}
