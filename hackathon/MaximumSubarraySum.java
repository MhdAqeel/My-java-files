import java.util.*;
public class MaximumSubarraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] arr = new int[length];
        for(int i = 0; i<length; i++){
            arr[i]=sc.nextInt();
        }
        int maxSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(currentSum + arr[i] > maxSum){
                maxSum = currentSum + arr[i];
            }
            if(currentSum + arr[i] < arr[i] ){
                currentSum = arr[i];
            }
            else{
                currentSum += arr[i];
            }


        }

        System.out.println("max sum: "+maxSum);

    }
}