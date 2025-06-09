import java.util.*;
import java.util.stream.*;

public class FlatListOfWords {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Java is fun", "Streams are powerful");

        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());

        System.out.println("words");
    }
}
