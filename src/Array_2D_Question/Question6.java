package Array_2D_Question;

public class Question6 {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3, 4, 5},
                        {3, 4, 5, 6, 7},
                        {7, 6, 5, 4, 3},
                        {8, 7, 6, 5, 4},
                        {1, 2, 7, 8, 0}};

        int m = arr.length;
        int n = m/2;

        for (int i=0; i<m; i++){
            for (int j=0; j<m; j++){
                if (i==n || j==n){
                    System.out.print(arr[i][j]+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
