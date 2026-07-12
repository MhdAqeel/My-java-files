import java.util.*;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Step 1: decide whether to extend or restart
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            // Step 2: THEN check if this new currentSum beats maxSum
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("max sum: " + maxSum);
    }
}