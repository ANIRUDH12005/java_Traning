public class CountOccurrences {

    public static int countOccurrences(int[] arr, int key) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2};
        int key = 2;

        int result = countOccurrences(arr, key);
        System.out.println("Element " + key + " occurs " + result + " times.");
    }
}

