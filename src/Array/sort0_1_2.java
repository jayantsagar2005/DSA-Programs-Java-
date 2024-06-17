package Array;

public class sort0_1_2 {

    public static void main(String[] args) {

        int[] array = {0,0,0,0,0,1,1,1,1,1};

        int i=0;
        int j=array.length-1;

        while (i<j){
            if (array[i]==0){
                i++;
            }

            if (array[j]==1){
                j--;
            }

            if (i<j && array[i]==1 && array[j]==0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        for (int ele: array ) {
            System.out.print(ele+" ");
        }

    }

}
