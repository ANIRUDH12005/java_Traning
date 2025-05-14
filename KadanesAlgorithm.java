public class KadanesAlgorithm {

    // Function to find the maximum subarray sum using Kadane's Algorithm
    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0];  // Overall max
        int currentMax = arr[0]; // Max ending at current position

        for (int i = 1; i < arr.length; i++) {
            // Either start new subarray at current element, or extend previous one
            currentMax = Math.max(arr[i], currentMax + arr[i]);

            // Update maxSoFar if currentMax is greater
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = maxSubArraySum(arr);

        System.out.println("Maximum Subarray Sum is: " + maxSum);
    }
}

