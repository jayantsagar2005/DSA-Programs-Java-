package Array_2D_Question;

public class Question4 {
    public static void main(String[] args) {
        int[][] arr = {{1,  4,  6,  9,  11},
                {3,  7,  14, 19, 20},
                {10, 13, 61, 22, 23},
                {2,  5,  8,  12, 18},
                {15, 17, 21, 24, 25}};

        int m = arr.length;
        int n =arr[0].length;

        int max = arr[0][0];

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }

        System.out.println("The maximum element is : "+max);
    }
}
