import java.util.*;

class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        // Normalize input (optional but good practice)
        String str = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object
        PalindromeChecker checker = new PalindromeChecker();

        // Call method
        if (checker.checkPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}