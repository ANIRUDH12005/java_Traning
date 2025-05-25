public class SubsequenceCheck {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aebdc";

        boolean result = isSubsequence(s1, s2);
        System.out.println("Is Subsequence? " + result);
    }

    public static boolean isSubsequence(String s1, String s2) {
        int i = 0; // pointer for s1
        int j = 0; // pointer for s2

        // Traverse both strings
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++; // move s1 pointer if characters match
            }
            j++; // always move s2 pointer
        }

        // If i reached end of s1, it's a subsequence
        return i == s1.length();
    }
}
