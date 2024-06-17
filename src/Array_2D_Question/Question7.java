package Array_2D_Question;

public class Question7 {
    public static void main(String[] args) {
//        int[][] arr = {{1,1,2,2},{1,2,2,4},{1,2,3,4},{1,4,1,2}};
//
//        int sum = 0;
//        int col = arr[0].length;
//
//        for (int i=0; i<4; i++){
//            sum = sum + arr[i][col];
//        }
//        System.out.println(sum);


        int[][] matrix = {{1, 1, 2, 2},
                          {1, 2, 2, 4},
                          {1, 2, 3, 4},
                          {1, 4, 1, 2}};

        int sum = 0;

        int col = matrix[0].length-1;


        for (int row = 0; row < 4; row++) {

            sum = sum + matrix[row][col];

        }


        System.out.println(sum);


    }
}
