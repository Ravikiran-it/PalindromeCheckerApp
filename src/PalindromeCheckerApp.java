/**
 * =====================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =====================================================================
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 * Description: This class normalizes input by removing spaces and
 * ignoring case sensitivity before performing validation.
 * @version 10.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 10.0");

        // UC10 Logic: Normalization
        String originalInput = "A man a plan a canal Panama";

        // Preprocessing: Remove all non-alphanumeric characters and convert to lower case
        // Hint: Use replaceAll("[^a-zA-Z0-9]", "")
        String normalizedInput = originalInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = checkPalindrome(normalizedInput);

        System.out.println("Original Input: " + originalInput);
        System.out.println("Normalized Input: " + normalizedInput);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }

    /**
     * Efficient Two-Pointer comparison logic
     */
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}