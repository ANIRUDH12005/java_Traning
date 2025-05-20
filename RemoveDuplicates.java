public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        String result = ""; // to store result without duplicates

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if character is not already in result, add it
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        return result;
    }
}
