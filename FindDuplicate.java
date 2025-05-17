public class FindDuplicate {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 2, 5, 3};  // 3 is the duplicate

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate number found: " + numbers[i]);
                    return; // exit after finding the first duplicate
                }
            }
        }

        System.out.println("No duplicate found.");
    }
}
