package Array_2D_Question;

public class Question2 {
    public static void main(String[] args) {

        int[][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] m2 = {{4,5,8},{0,0,8},{1,2,0}};

        int m = m1.length;
        int n = m1[0].length;

        int[][] ans = new int[m][n];

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                ans[i][j] = m1[i][j] + m2[i][j];
            }
        }

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
