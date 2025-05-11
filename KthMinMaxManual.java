public class KthMinMaxManual {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        System.out.print("Enter number of elements: ");
        int n = Integer.parseInt(reader.readLine());

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        System.out.print("Enter the value of k: ");
        int k = Integer.parseInt(reader.readLine());

        if (k <= 0 || k > n) {
            System.out.println("Invalid value of k.");
            return;
        }

        // Simple bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int kthMin = arr[k - 1];
        int kthMax = arr[n - k];

        System.out.println("Kth minimum element: " + kthMin);
        System.out.println("Kth maximum element: " + kthMax);
    }
}