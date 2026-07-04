import java.util.Arrays;

public class RotateArray {
    public static void reverse(int[] arr, int left, int right) {
        while (left <= right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        rotate(arr1, 3);
        System.out.println(Arrays.toString(arr1)); // expect [5,6,7,1,2,3,4]

        int[] arr2 = {1,2,3,4,5,6,7};
        rotate(arr2, 2);
        System.out.println(Arrays.toString(arr2)); // expect [6,7,1,2,3,4,5]

        int[] arr3 = {1,2,3,4,5,6,7};
        rotate(arr3, 0);
        System.out.println(Arrays.toString(arr3)); // expect [1,2,3,4,5,6,7] unchanged

        int[] arr4 = {1,2,3,4,5,6,7};
        rotate(arr4, 7);
        System.out.println(Arrays.toString(arr4)); // expect [1,2,3,4,5,6,7] unchanged (k%n = 0)

        int[] arr5 = {1,2,3,4,5,6,7};
        rotate(arr5, 10); // 10 % 7 = 3, same rotation as arr1
        System.out.println(Arrays.toString(arr5)); // expect [5,6,7,1,2,3,4]
    }
}