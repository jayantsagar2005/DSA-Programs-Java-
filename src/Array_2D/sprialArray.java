package Array_2D;

public class sprialArray {
    public static void main(String[] args) {
        int ans = 10;

        int[][] arr = new int[7][7];

        int minR = 0;
        int maxR = arr.length-1;

        int minC = 0;
        int maxC = arr[0].length-1;

        while(maxC >= minC){
            for(int i=minC; i<=maxC; i++){
                arr[minR][i] = ans;
                ans++;
            }
            minR++;

            if(maxR<minR || maxC<minC){
                break;
            }
            for(int i=minR; i<=maxR; i++){
                arr[i][maxC] = ans;
                ans++;
            }
            maxC--;

            if(maxR<minR || maxC<minC){
                break;
            }
            for(int i=maxC; i>=minC; i--){
                arr[maxR][i] = ans;
                ans++;
            }
            maxR--;

            if(maxR<minR || maxC<minC){
                break;
            }
            for(int i=maxR; i>=minR; i--){
                arr[i][minC] = ans;
                ans++;
            }
            minC++;
        }

        display(arr);
    }

    public static void display(int[][] arr) {
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
