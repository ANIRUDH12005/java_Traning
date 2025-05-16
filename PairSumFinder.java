public class PairSumFinder {

    public static void findPairs(int[] arr, int target) {
        // Use HashSet to keep track of seen numbers
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();

        // Use HashSet to avoid printing duplicate pairs
        java.util.HashSet<String> printedPairs = new java.util.HashSet<>();

        System.out.println("Pairs with sum " + target + ":");

        for (int num : arr) {
            int complement = target - num;

            if (seen.contains(complement)) {
                int small = Math.min(num, complement);
                int large = Math.max(num, complement);
                String pair = small + "," + large;

                if (!printedPairs.contains(pair)) {
                    System.out.println("(" + small + ", " + large + ")");
                    printedPairs.add(pair);
                }
            }

            seen.add(num);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 3, 5, 7, 8, 1};
        int targetSum = 9;

        findPairs(numbers, targetSum);
    }
}

