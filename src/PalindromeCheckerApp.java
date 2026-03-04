/**
 * =====================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =====================================================================
 * Use Case 3: Reverse String Based Palindrome Check
 * Description: This class checks whether a string is a palindrome
 * by reversing the string and comparing it with the original value.
 * @version 3.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 3.0");

        // UC3 Logic: Reverse and Compare
        String input = "madam";
        String reversed = "";

        // Hint: Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // String concatenation
        }

        // Comparison using equals()
        boolean isPalindrome = input.equals(reversed);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}