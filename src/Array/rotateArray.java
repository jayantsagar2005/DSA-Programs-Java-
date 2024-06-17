package Array;

public class rotateArray {
    public static void main(String[] args) {

        int[] array = {-10};
        int k = 2;
        int n = array.length;

        k = k % n;

        reverse(array,0,n-k-1);
        reverse(array,n-k,n-1);
        reverse(array,0,n-1);

        for (int ele: array) {
            System.out.print(ele+" ");
        }


    }

    public static void reverse(int[] array, int low, int high) {
        int i = low;
        int j = high;

        while (i<j){
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            i++;
            j--;
        }
    }
}
