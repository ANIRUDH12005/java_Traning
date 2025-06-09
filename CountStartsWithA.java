import java.util.Arrays;
import java.util.List;

public class CountStartsWithA {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "Avocado");

        long count = words.stream()
                          .filter(w -> w.startsWith("A") || w.startsWith("a"))
                          .count();

        System.out.println(count);
    }
}
