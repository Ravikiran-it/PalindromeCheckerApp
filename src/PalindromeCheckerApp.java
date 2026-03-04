import java.util.Stack;

/**
 * =====================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =====================================================================
 * Use Case 6: Case-Insensitive Palindrome Check
 * Description: This class standardizes the input to lower case to ensure
 * that palindromes with different casing (e.g., "Madam") are validated correctly.
 * @version 6.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 6.0");

        // UC6 Logic: Handling Case Sensitivity
        String originalInput = "Madam";

        // Standardize input to lower case
        String input = originalInput.toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push standardized characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Original Input : " + originalInput);
        System.out.println("Standardized Input : " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}