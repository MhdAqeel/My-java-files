import java.util.*;
public class Main {

    public static int[][] solve(int[][] arr){
        Arrays.sort(arr , (a,b) ->Integer.compare(a[0],b[0]));
        
        ArrayList <int[]> list = new ArrayList<>();
        for(int[] iter : arr){
            if(list.isEmpty() || list.get(list.size()-1)[1]<iter[0] ){
                list.add(iter);
            }
            else{
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1], iter[1]);
            }
        }

        return list.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [][] arr = new int[len][2];
        for(int i=0; i<len; i++){
            for(int j=0; j<2; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int[][] arr2 = solve(arr);
        for(int[] sol : arr2){
            System.out.println(sol [0]+ " "+ sol[1]);
        }
    }
}
