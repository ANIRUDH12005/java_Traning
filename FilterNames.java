import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Ravi", "Abhishek", "Raj");

        String result = names.stream()
                             .filter(name -> name.length() > 4)
                             .collect(Collectors.joining(","));

        System.out.println(result);
    }
}
