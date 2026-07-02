public class StringCompression {
    public static String compress(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i <= s.length(); i++) {
            // TODO: compare s.charAt(i) with s.charAt(i-1)
            // TODO: if same, increment count
            // TODO: if different (or end of string reached), append char + count, reset count
            if (i<s.length()) {
                if(s.charAt(i) == s.charAt(i-1)){
                count++;
                }
                else{
                    result.append(s.charAt(i-1)).append(count);
                    count = 1;
                }
            }
            else{
                result.append(s.charAt(i-1)).append(count);
            }
            
        }
        
        // TODO: compare result.length() with s.length(), return the shorter one
        
        if(s.length()<=result.length()){
            return s;
        }

        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa")); // expect a2b1c5a3
        System.out.println(compress("abc"));          // expect abc
    }
}