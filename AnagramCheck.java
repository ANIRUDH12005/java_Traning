public class AnagramCheck {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            System.out.println("The strings are NOT anagrams.");
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            java.util.Arrays.sort(arr1);
            java.util.Arrays.sort(arr2);

            boolean result = java.util.Arrays.equals(arr1, arr2);

            if (result) {
                System.out.println("The strings are anagrams!");
            } else {
                System.out.println("The strings are NOT anagrams.");
            }
        }

        sc.close();
    }
}
