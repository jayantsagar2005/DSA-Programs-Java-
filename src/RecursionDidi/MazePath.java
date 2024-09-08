package RecursionDidi;

public class MazePath {
    public static void main(String[] args) {
        int m = 4;
        int n = 3;
        int ans = printPath(m, n,1,1, "");
        System.out.println("Total maze path --> "+ans);
    }

    public static int printPath(int m, int n, int a, int b, String ans) {
        if(m == a && n == b){
            System.out.println(ans);
            return 1;
        }
        if(m < a || n < b){
            return 0;
        }
        int rightPath = printPath(m, n, a, b+1, ans+"R");
        int downPath = printPath(m, n, a+1, b, ans+"D");

        return rightPath + downPath;
    }
}
