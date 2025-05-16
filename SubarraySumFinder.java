public class SubarraySumFinder {

    public static void findSubarrayWithSum(int[] arr, int target) {
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            // Shrink the window from the start if sum is too big
            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            // Check if we found the target sum
            if (currentSum == target) {
                System.out.print("Subarray found from index " + start + " to " + end + ": ");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                return;
            }
        }

        // If we reach here, no subarray was found
        System.out.println("No subarray found with sum " + target);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;

        findSubarrayWithSum(numbers, targetSum);
    }
}

