public class CountAndSay {
    public static void main(String[] args) {
        int n = 5;  
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String previous = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();

        int count = 1;
        char sayChar = previous.charAt(0);

        for (int i = 1; i < previous.length(); i++) {
            if (previous.charAt(i) == sayChar) {
                count++;
            } else {
                result.append(count).append(sayChar);
                sayChar = previous.charAt(i);
                count = 1;
            }
        }
        result.append(count).append(sayChar);
        return result.toString();
    }
}
