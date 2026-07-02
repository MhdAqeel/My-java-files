import java.util.*;

public class FrequencyCounter {
    public static int mostFrequent(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        // Step 1: count frequencies
        for (int num : arr) {
            // TODO: update freq map
            if(freq.containsKey(num)){
                freq.put(num, freq.get(num)+1);
            }
            else{
                freq.put(num, 1);
            }

        }
        
        // Step 2: find the element with max frequency, smallest on tie
        int result = arr[0];
        int maxCount = 0;
        
        for (int key : freq.keySet()) {
            // TODO: compare and update result
            if (freq.get(key)>maxCount){
                maxCount = freq.get(key);
                result = key;
            }
            if(freq.get(key) == maxCount && key<result){
                result = key;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {7,7,7,2,2};
        System.out.println(mostFrequent(arr)); // expect 5
    }
}
