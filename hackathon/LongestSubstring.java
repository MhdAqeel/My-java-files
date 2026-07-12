import java.util.*;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            // TODO: while c is already in window, remove s.charAt(left) and move left forward
            while(window.contains(c)){
                window.remove(s.charAt(left));
                left++;
            }
            
            window.add(c);
            // TODO: add c to window
            
            // TODO: update maxLen using (right - left + 1)
            if(maxLen<right-left+1){
                maxLen = right-left+1;
            }
        }
        
        return maxLen;
    }
    
    public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabcbb")); // expect 3
    System.out.println(lengthOfLongestSubstring("bbbbb"));    // expect 1
    System.out.println(lengthOfLongestSubstring("pwwkew"));   // expect 3
    }
}