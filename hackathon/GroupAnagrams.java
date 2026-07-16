import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> groups = new HashMap<>();
        
        for (String word : words) {
            // TODO: compute the sorted-letters key for this word
            char[] charecters = word.toCharArray();
            Arrays.sort(charecters);
            String key = new String(charecters);
            
            // TODO: if key not in map yet, create a new empty list for it
            groups.putIfAbsent(key, new ArrayList<>());
            
            // TODO: add the ORIGINAL word to the list under that key
            groups.get(key).add(word);
        }
        
        return new ArrayList<>(groups.values());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) words[i] = sc.next();
        
        List<List<String>> result = groupAnagrams(words);
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}