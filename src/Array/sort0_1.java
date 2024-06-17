package Array;

public class sort0_1 {
    public static void main(String[] args) {

        int[] array = {0,1,0,0,1,1,1,0,0,0,0,1,1};

        int zeros = 0;
        int ones = 0;

        for (int i=0; i<array.length; i++){
            if (array[i]==0){
                zeros++;
            }
            if (array[i]==1){
                ones++;
            }
        }

        for (int i=0; i<array.length; i++){
            if (i<zeros){
                array[i] = 0;
            }else {
                array[i] = 1;
            }
        }

        for (int ele: array ) {
            System.out.print(ele+" ");
        }
    }
}
