package Array_2D;

public class flippingMatrix {
    public static void main(String[] args) {
        int[][]  arr = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};

        int m = arr.length;
        int n =arr[0].length;

        for (int i=0; i<m; i++){
            if (arr[i][0] == 0){
                for (int j=0; j<n; j++){
                    if (arr[i][j] == 0){
                        arr[i][j] = 1;
                    }else{
                        arr[i][j] = 0;
                    }
                }
            }
        }

        for (int i=1; i<n; i++){

            int noOfZeroes = 0;
            int noOfOnes = 0;

            for (int j=0; j<m; j++){
                if (arr[j][i]==0){
                    noOfZeroes++;
                }else{
                    noOfOnes++;
                }
            }

            if (noOfZeroes>noOfOnes){
                for (int j=0; j<m; j++){
                    if (arr[j][i]==0){
                        arr[j][i] = 1;
                    }else{
                        arr[j][i] = 0;
                    }
                }
            }
        }

        int sum = 0;
        int x =1;

        for (int i=n-1; i>=0; i--){
            for (int j=0; j<m; j++){
               int temp = arr[j][i] * x;
                sum = sum + temp;
            }

            x = x * 2;
        }

        System.out.println(sum);

//        for (int i=0; i<m; i++){
//            for (int j=0; j<n; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

    }
}
