package Array_2D_Question;

public class Question13 {
    public static void main(String[] args) {
//        int[][] arr = {{1,1,1},
//                       {1,0,1},
//                       {1,1,1}};

        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        int m = arr.length;
        int n = arr[0].length;

        int[][] ans = new int[m][n];

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                ans[i][j] = arr[i][j];
            }
        }

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (ans[i][j]==0){
                    for (int k=0; k<n; k++){
                        arr[i][k] = 0;
                    }

                    for (int k=0; k<m; k++){
                        arr[k][j] = 0;
                    }


                }
            }
        }

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
