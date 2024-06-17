package Array_2D;

public class setZeroes1 {

    public static void main(String[] args) {
        int[][] arr = { {0,1,2,0},
                        {3,4,5,2},
                        {1,3,1,5}};

        int m = arr.length;
        int n =arr[0].length;

        boolean row = false;
        boolean column = false;

        for (int i=0; i<n; i++){
            if (arr[0][i] == 0){
                row = true;
                break;
            }
        }

        for (int i=0; i<m; i++){
            if (arr[i][0] == 0){
                column = true;
                break;
            }
        }

        for (int i=1; i<m; i++){
            for (int j=1; j<n; j++){
                if (arr[i][j] == 0){
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }


        for (int i=1; i<n; i++){
            if (arr[0][i] == 0){
                for (int j=0; j<m; j++){
                    arr[j][i] = 0;
                }
            }
        }

        for (int i=1; i<m; i++){
            if (arr[i][0] == 0){
                for (int j=0; j<n; j++){
                    arr[i][j] = 0;
                }
            }
        }


        if (row){
            for (int i=0; i<n; i++){
                arr[0][i] = 0;
            }
        }

        if (column){
            for (int i=0; i<m; i++){
                arr[i][0] = 0;
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
