public class readerotateArray {

    // Function to rotate the array by one position to the right
    public static void rotateByOne(int[] arr) {
        if (arr.length == 0) return;

        // Store the last element
        int last = arr[arr.length - 1];

        // Shift all elements one position to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Place the last element at the first position
        arr[0] = last;
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        printArray(arr);

        rotateByOne(arr);

        System.out.println("Array after rotating by one:");
        printArray(arr);
    }
}
