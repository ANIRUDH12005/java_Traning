public class SortedAndRotated {

    public static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length;
        int count = 0;

        // Count the number of places where the next element is smaller than the current
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        // If count is exactly 1, it means the array is sorted and rotated
        return (count == 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2}; // true
        int[] arr2 = {1, 2, 3, 4, 5}; // false
        int[] arr3 = {2, 1, 3, 4, 5}; // false

        System.out.println(isSortedAndRotated(arr1)); // true
        System.out.println(isSortedAndRotated(arr2)); // false
        System.out.println(isSortedAndRotated(arr3)); // false
    }
}

