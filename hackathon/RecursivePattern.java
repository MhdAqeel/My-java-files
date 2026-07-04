public class RecursivePattern {
    public static void printRows(int current, int n) {
        // TODO: base case
        if(current>n){
           return;
        }
        printOneRow(current, n);
        // TODO: build the row string (handle the i%3==0 case with leading spaces)
        // TODO: print it
        // TODO: recursive call for next row
        printRows(current+1, n);  
    }
   public static void printOneRow(int i, int n) {
    StringBuilder sb = new StringBuilder();
    int spaces = (i % 3 == 0) ? (n - i) : 0;
    for (int j = 0; j < spaces; j++) sb.append(' ');
    for (int j = 0; j < i; j++) sb.append('*');
    System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        printRows(1, 5);
    }
}


