import java.util.LinkedList;

/**
 * =====================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =====================================================================
 * Use Case 8: Linked List Based Palindrome Checker
 * Description: This class checks whether a string is a palindrome
 * using a LinkedList. Characters are added to the list and then compared
 * by removing elements from both ends.
 * @version 8.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 8.0");

        // UC8 Logic: LinkedList Symmetric Validation
        String input = "level";
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            // removeFirst() and removeLast() support symmetric validation
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}