public class ValidPalindrome {

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // If characters don't match
            if (s.charAt(left) != s.charAt(right)) {
                // Try skipping left or right character
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true; // It's already a palindrome
    }

    // Helper method to check if substring is a palindrome
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abca";
        System.out.println(validPalindrome(s1)); // true

        String s2 = "racecar";
        System.out.println(validPalindrome(s2)); // true

        String s3 = "abc";
        System.out.println(validPalindrome(s3)); // false
    }
}
