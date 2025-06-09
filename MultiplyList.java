
import java.util.*;

public class MultiplyList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        int result = numbers.stream()
                            .reduce(1, (a, b) -> a * b);

        System.out.println("Product: " + result);
    }
}