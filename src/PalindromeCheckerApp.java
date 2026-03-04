/**
 * =====================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =====================================================================
 * Use Case 9: Recursive Palindrome Checker
 * Description: This class uses recursion to validate a palindrome.
 * It compares the first and last characters and makes a recursive call
 * for the inner substring.
 * @version 9.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 9.0");

        // UC9 Logic: Recursion
        String input = "radar";

        // Call the recursive helper method
        boolean isPalindrome = checkPalindromeRecursive(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? (Recursive) : " + isPalindrome);
    }

    /**
     * Recursive method to check palindrome.
     * @param str The string to check.
     * @param start Starting index.
     * @param end Ending index.
     * @return true if palindrome, false otherwise.
     */
    public static boolean checkPalindromeRecursive(String str, int start, int end) {
        // Base Condition: If pointers cross or meet, it's a palindrome
        if (start >= end) {
            return true;
        }

        // Recursive Step: Compare characters and move inward
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return checkPalindromeRecursive(str, start + 1, end - 1);
    }
}