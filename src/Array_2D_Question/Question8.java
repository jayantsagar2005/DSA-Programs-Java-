package Array_2D_Question;

public class Question8 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,7,5},{4,5,6,5,7},{7,8,9,3,9},{4,5,8,6,4},{8,9,6,7,4}};

        int m =arr.length;

        for (int i=0; i<m; i++){
            for (int j=0; j<m; j++){
                if (i==j || i+j==m-1){
                    System.out.print(arr[i][j]+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
