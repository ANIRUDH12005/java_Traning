import java.util.Arrays;
import java.util.List;

public class PriceSum {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(999, 1000, 1500, 1000, 2000);

        int total = prices.stream()
                          .distinct()
                          .filter(p -> p > 1000)
                          .reduce(0, Integer::sum);

        System.out.println(total);
    }
}
