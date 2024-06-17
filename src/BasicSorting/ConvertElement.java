package BasicSorting;

public class ConvertElement {
    public static void main(String[] args) {

        int[] arr = {54,11,28,91,47,63};

        int x = 0;


        for (int i=0; i<arr.length; i++){
            int min = Integer.MAX_VALUE;
            int min_idx = -1;
            for (int j=0; j<arr.length; j++){
                if (min > arr[j] && arr[j] > 0){
                    min = arr[j];
                    min_idx = j;
                }
            }
            arr[min_idx] = x;
            x--;
        }

        for (int i=0; i<arr.length; i++){
            arr[i] = arr[i] * -1;
        }

        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
