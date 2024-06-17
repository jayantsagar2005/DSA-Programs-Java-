package Array_2D_Question;

public class Question9 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int m =arr.length;
        int n = arr[0].length;

        for (int i=0; i<m; i++){
            for (int j=i; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] =  temp;
            }
        }


        for (int i=0; i<n; i++){
            int a = 0;
            int b = m-1;
            while (a<b){
                int temp = arr[a][i];
                arr[a][i] = arr[b][i];
                arr[b][i] = temp;
                a++;
                b--;
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
