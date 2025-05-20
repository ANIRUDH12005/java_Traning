public class StringPermutations {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("Permutations of " + str + ":");
        printPermutations(str, "");
    }

    // Recursive function to print all permutations
    public static void printPermutations(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            printPermutations(remaining, prefix + ch);
        }
    }
}
