package Array_2D_Question;

public class Question5 {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{3,4,7,8},{1,4,12,3}};

        int[] ans = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            int sum = 0;
            for (int j=0; j<arr[0].length; j++){
                sum = sum + arr[i][j];
            }
            ans[i] = sum;
        }

        int max = ans[0];

        for (int i=0; i<ans.length; i++){
            if (max<ans[i]){
                max = ans[i];
            }
        }

        for (int i=0; i<ans.length; i++){
            if (max==ans[i]){
                System.out.println(i+" number rows elements sum is largest("+max+")");
            }
        }
    }
}
