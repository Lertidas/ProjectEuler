import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

 */
public class Problem4 {
    public String solve(){
        List<String> test = new ArrayList<>(Arrays.asList("sfafg", "sdfgs", "trw"));
        test = Sorting.mergeSort(test);
        System.out.println(test);
        // Generate all possible products of 3-digit numbers
        List<String> possiblePalindromes = new ArrayList<>();
        for (int a = 100; a < 1000; a++) {
            for (int b = 100; b < 1000; b++) {
                possiblePalindromes.add(Integer.toString(a * b));
            }
        }
        return Integer.toString(0);
    }

    // Recursive function that checks if value is a palindrome
    private boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }
        else if (s.charAt(0) == s.charAt(s.length()-1)) {
            return isPalindrome(s.substring(1, s.length()-1));
        }
        else {
            return false;
        }
    }
}
