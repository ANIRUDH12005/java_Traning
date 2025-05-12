public class RearrangeArray {
    public static void rearrange(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left if already negative
            while (arr[left] < 0 && left < right) {
                left++;
            }

            // Move right if already positive
            while (arr[right] >= 0 && left < right) {
                right--;
            }

            // Swap if left is positive and right is negative
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -1, 5, -3};

        rearrange(arr);

        // Print the result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}

