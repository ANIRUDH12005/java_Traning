public class StrStrExample {

    public static int strStr(String haystack, String needle) {
        // If needle is empty, return 0
        if (needle.isEmpty()) {
            return 0;
        }

        // Loop through haystack until there's no room for needle
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if substring matches
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        // Not found
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int result = strStr(haystack, needle);
        System.out.println("Index of first occurrence: " + result); // Output: 2
    }
}
