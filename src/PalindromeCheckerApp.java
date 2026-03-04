/**
 * =====================================================================
 * SERVICE CLASS - PalindromeService (Encapsulation)
 * =====================================================================
 */
class PalindromeService {
    /**
     * Business Logic for Palindrome Check.
     * This method is encapsulated and can be reused elsewhere.
     */
    public boolean check(String input) {
        if (input == null) return false;
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/**
 * =====================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =====================================================================
 * Use Case 11: Object-Oriented Palindrome Service
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 11.0 (OOP Edition)");

        // UC11: Using the Service Object
        String testData = "Was it a car or a cat I saw?";

        // Creating an object of the Service Class
        PalindromeService service = new PalindromeService();

        // Invoking the encapsulated method
        boolean result = service.check(testData);

        System.out.println("Testing OOPS Logic with: " + testData);
        System.out.println("Is it a Palindrome? : " + result);
    }
}