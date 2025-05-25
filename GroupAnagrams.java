import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        // Example input
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Call the function
        List<List<String>> groupedAnagrams = groupAnagrams(words);

        // Print result
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to hold sorted word as key, and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert word to char array, sort it, and convert back to string
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Add the original word to the correct group in the map
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }

        // Return the values (which are lists of anagrams)
        return new ArrayList<>(map.values());
    }
}
