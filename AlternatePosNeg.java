public class AlternatePosNeg {

    public static void rearrange(int[] arr) {
        int n = arr.length;

        
        int[] positives = new int[n];
        int[] negatives = new int[n];
        int posCount = 0, negCount = 0;

    
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positives[posCount++] = arr[i];
            } else {
                negatives[negCount++] = arr[i];
            }
        }

        
        int i = 0, p = 0, ng = 0;
        while (p < posCount && ng < negCount) {
            arr[i++] = positives[p++];
            arr[i++] = negatives[ng++];
        }

        while (p < posCount) {
            arr[i++] = positives[p++];
        }

        while (ng < negCount) {
            arr[i++] = negatives[ng++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -1, 4};
        rearrange(arr);

        System.out.println("Rearranged array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

