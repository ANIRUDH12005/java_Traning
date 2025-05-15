public class ArrayLeaders {

    public static void findLeaders(int[] arr) {
        int n = arr.length;

        // Last element is always a leader
        int maxFromRight = arr[n - 1];
        System.out.print("Leaders: " + maxFromRight + " ");

        // Traverse from second last to first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeaders(arr);  // Output: Leaders: 2 5 17
    }
}

