import java.util.Arrays;
import java.util.List;

public class DivisibleBySeven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 14, 22, 30);

        boolean hasDivisibleBy7 = numbers.stream()
                                         .anyMatch(n -> n % 7 == 0);

        System.out.println(hasDivisibleBy7);
    }
}
