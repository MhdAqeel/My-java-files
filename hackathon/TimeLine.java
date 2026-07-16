import java.util.*;
public class TimeLine {
    public static int[][] merge(int[][] intervals) {
    // TODO: sort intervals by start value
    Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));

    
    List<int[]> result = new ArrayList<>();
    
    for (int[] interval : intervals) {
        // TODO: if result is empty OR interval doesn't overlap with last result entry -> add new
        if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
            result.add(interval);
        } else {
            // TODO: else -> merge (update last entry's end)
            result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
        }
    }
    
    return result.toArray(new int[0][]);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        
        int [][] mergedIntervals = merge(arr);
        //print merged intervals
        for (int i = 0; i < mergedIntervals.length; i++) {
            System.out.println(mergedIntervals[i][0] + " " + mergedIntervals[i][1]);
        }
    }    
}
