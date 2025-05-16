public class MissingNumberFinder {

    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6}; 
        int n = 6;  

        int missing = findMissingNumber(numbers, n);
        System.out.println("Missing number is: " + missing);
    }
}

