package Array_2D;

public class searchTargetValue1 {
    public static void main(String[] args) {

        int[][] arr = {{1,  4,  6,  9,  11},
                       {2,  5,  8,  12, 18},
                       {3,  7,  14, 19, 20},
                       {10, 13, 16, 22, 23},
                       {15, 17, 21, 24, 25}};

        int key = 11;

        int m = arr.length;
        int n = arr[0].length;

        int i = m-1;
        int j = 0;
        int count = 0;

        while (i>=0 && j<n){
            if (arr[i][j] == key){
                System.out.println(i+" "+j);
                count++;
            }
            if (arr[i][j] < key){
                j++;
            }else{
                i--;
            }
        }

        if (count==0){
            System.out.println("Element is not found!");
        }
    }
}
