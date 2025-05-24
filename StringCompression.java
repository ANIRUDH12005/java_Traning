public class StringCompression {

    public static int compress(char[] chars) {
        int index = 0; // position to write in the array
        int i = 0;     // current read position

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count how many times the currentChar repeats
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the character
            chars[index++] = currentChar;

            // If count > 1, write the digits of the count
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; // new length
    }

    public static void main(String[] args) {
        char[] input = {'a','a','b','b','c','c','c'};
        int newLength = compress(input);

        // Print the compressed characters
        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println("\nLength: " + newLength);
    }
}
