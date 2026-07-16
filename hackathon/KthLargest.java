import java.util.*;

public class KthLargest {
    public static int findKthLargest(int[] arr, int k) {
        // TODO: sort ascending, then return the element k positions from the end
        Arrays.sort(arr);
        return arr[arr.length-k];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        
        System.out.println(findKthLargest(arr, k));
    }
}