import java.util.*;

/**
 * UC12/13: Strategy and Performance Comparison
 */
interface PalindromeStrategy {
    boolean isPalindrome(String text);
}

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

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 13.0 (Performance Benchmarking)");

        String testData = "A man a plan a canal Panama";
        PalindromeStrategy strategy;

        // --- Benchmark Two-Pointer ---
        strategy = new TwoPointerStrategy();
        long startTP = System.nanoTime();
        strategy.isPalindrome(testData);
        long endTP = System.nanoTime();
        System.out.println("Two-Pointer Time: " + (endTP - startTP) + " ns");

        // --- Benchmark Stack ---
        strategy = new StackStrategy();
        long startStack = System.nanoTime();
        strategy.isPalindrome(testData);
        long endStack = System.nanoTime();
        System.out.println("Stack Strategy Time: " + (endStack - startStack) + " ns");

        System.out.println("Performance Comparison Complete.");
    }
}