package Array;

public class reversearray {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80,90};

        reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public static void reverse(int[] array) {

        int low = 0;
        int high = array.length-1;

        while (low<high){
            int temp = array[high];
            array[high] = array[low];
            array[low] = temp;
            low++;
            high--;
        }
    }
}
