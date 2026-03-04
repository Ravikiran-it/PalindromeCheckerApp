/**
 * =====================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =====================================================================
 * Use Case 2: Hardcoded Palindrome Validation
 * Description: This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 * @version 2.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 2.0");

        // UC2: Hardcoded Palindrome Logic
        String input = "madam";
        boolean isPalindrome = true;

        // Loop only till half of the string length as per UC2 Hint
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}