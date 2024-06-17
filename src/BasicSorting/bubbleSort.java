package BasicSorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {74,12,3,74,55,46,19};

        System.out.print("UnSorted Array : ");
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();

        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.print("Sorted Array : ");
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
    }
}
