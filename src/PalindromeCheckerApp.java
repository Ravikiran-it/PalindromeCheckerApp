import java.util.Stack;

/**
 * =====================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =====================================================================
 * Use Case 5: Stack Based Palindrome Checker
 * Description: This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 * @version 5.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 5.0");

        // UC5: Stack-Based Logic
        String input = "noon";
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Iterate again through original string and compare with popped values
        for (char c : input.toCharArray()) {
            // Stack.pop() returns elements in reverse order (LIFO)
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}