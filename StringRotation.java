public class StringRotation {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";

        boolean result = isRotation(str1, str2);
        System.out.println("Is Rotation? " + result);
    }

    public static boolean isRotation(String s1, String s2) {
        // Check if lengths are equal and not empty
        if (s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }

        // Concatenate s1 with itself
        String combined = s1 + s1;

        // Check if s2 is a substring of combined
        return combined.contains(s2);
    }
}
