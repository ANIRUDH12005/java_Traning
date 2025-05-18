public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = maxEndingHere;

            maxEndingHere = Math.max(Math.max(nums[i], maxEndingHere * nums[i]), minEndingHere * nums[i]);
            minEndingHere = Math.min(Math.min(nums[i], temp * nums[i]), minEndingHere * nums[i]);

            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums));
    }
}
