import java.util.*;

/**
 * STRATEGY INTERFACE
 */
interface PalindromeStrategy {
    boolean isPalindrome(String text);
}

/**
 * CONCRETE STRATEGY 1: Stack Based
 */
class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        String clean = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        Stack<Character> stack = new Stack<>();
        for (char c : clean.toCharArray()) stack.push(c);
        for (char c : clean.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

/**
 * CONCRETE STRATEGY 2: Two-Pointer Based
 */
class TwoPointerStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        String clean = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) return false;
        }
        return true;
    }
}

/**
 * MAIN CLASS - PalindromeCheckerApp
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 12.0 (Design Patterns Edition)");

        String testData = "Top spot";

        // Dynamic Strategy Selection (Polymorphism)
        PalindromeStrategy strategy;

        // Using Two-Pointer Strategy
        strategy = new TwoPointerStrategy();
        System.out.println("Using Two-Pointer: " + strategy.isPalindrome(testData));

        // Swapping to Stack Strategy at Runtime
        strategy = new StackStrategy();
        System.out.println("Using Stack: " + strategy.isPalindrome(testData));
    }
}