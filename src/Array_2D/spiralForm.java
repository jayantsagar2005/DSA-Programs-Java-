package Array_2D;

public class spiralForm {
    public static void main(String[] args) {

        int[][] arr = {{1,  2,  3,  4,  5},
                      {6,  7,  8,  9,  10},
                      {11, 12, 13, 14, 15},
                      {16, 17, 18, 19, 20},
                      {21, 22, 23, 24, 25},
                      {26, 27, 28, 29, 30}};

        int minr = 0;
        int maxr = arr.length-1;

        int minc = 0;
        int maxc = arr[0].length-1;

        while (maxr>=minr && maxc>=minc){


            for (int i=minc; i<=maxc; i++){
                System.out.print(arr[minr][i]+" ");
            }
            minr++;

            if(maxr<minr || maxc<minc){
                break;
            }
            for (int i=minr; i<=maxr; i++){
                System.out.print(arr[i][maxc]+" ");
            }
            maxc--;

            if(maxr<minr || maxc<minc){
                break;
            }
            for (int i=maxc; i>=minc; i--){
                System.out.print(arr[maxr][i]+" ");
            }
            maxr--;

            if(maxr<minr || maxc<minc){
                break;
            }
            for (int i=maxr; i>=minr; i--){
                System.out.print(arr[i][minc]+" ");
            }
            minc++;


        }


    }
}