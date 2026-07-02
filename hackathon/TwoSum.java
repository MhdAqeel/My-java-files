import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>(); // value -> index
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(seen.containsKey(complement)){
                return new int[] {seen.get(complement),i};
            }
            else{
                seen.put(nums[i], i);
            }
            // TODO: check if complement exists in map
            // TODO: if yes, return the pair of indices
            // TODO: if no, add nums[i] and its index to the map
        }
        
        return new int[] {-1, -1}; // no solution found
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]); // expect 0, 1
    }
}