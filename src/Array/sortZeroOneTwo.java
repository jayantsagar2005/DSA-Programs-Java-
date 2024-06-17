package Array;

public class sortZeroOneTwo {

    public static void main(String[] args) {

        int[] array = {0,1,2,0,1,2,1,2,2,0,1,2,2,0,1,0,1,2,0};

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
            } else if (i<ones+zeros) {
                array[i] = 1;
            }else {
                array[i] = 2;
            }
        }

        for (int ele: array ) {
            System.out.print(ele+" ");
        }
    }
}
