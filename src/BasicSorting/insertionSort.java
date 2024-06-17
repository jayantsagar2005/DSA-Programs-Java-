package BasicSorting;

public class insertionSort {

    public static void arrayPrint(int[] arr) {
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] arr = {10,-4,20,78,-6,8};

        for (int i=1; i<arr.length; i++){
            for (int j=0; j<i; j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            arrayPrint(arr);
        }

//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
    }
}
