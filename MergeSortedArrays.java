public class MergeSortedArrays {
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int gap = nextGap(n + m);

        while (gap > 0) {
            int i = 0;
            int j = gap;

            while (j < (n + m)) {
                int a = get(arr1, arr2, i, n);
                int b = get(arr1, arr2, j, n);

                if (a > b) {
                    set(arr1, arr2, i, n, b);
                    set(arr1, arr2, j, n, a);
                }

                i++;
                j++;
            }

            gap = nextGap(gap);
        }
    }

    private static int get(int[] arr1, int[] arr2, int index, int n) {
        return (index < n) ? arr1[index] : arr2[index - n];
    }

    private static void set(int[] arr1, int[] arr2, int index, int n, int value) {
        if (index < n)
            arr1[index] = value;
        else
            arr2[index - n] = value;
    }

    private static int nextGap(int gap) {
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        merge(arr1, arr2);

        System.out.print("arr1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        System.out.print("\narr2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
