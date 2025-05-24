public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        boolean[] seen = new boolean[128]; // ASCII characters
        int left = 0, right = 0, maxLength = 0;

        while (right < s.length()) {
            char current = s.charAt(right);

            // If character is not in the current window
            if (!seen[current]) {
                seen[current] = true;
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                // Remove character at left pointer
                seen[s.charAt(left)] = false;
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Longest length: " + result); // Output: 3
    }
}
