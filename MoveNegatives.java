public class MoveNegatives {

    // Function to move negative numbers to the beginning
    public static void rearrange(int[] arr) {
        int j = 0;  // Pointer for negative numbers

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++; // Move j to next position
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -5, 6, -7};

        rearrange(arr);

        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

