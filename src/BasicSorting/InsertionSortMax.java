package BasicSorting;

public class InsertionSortMax {
    public static void main(String[] args) {
        int[] arr = {10,-4,20,78,-6,8};

//

        for (int i=arr.length-2; i>=0; i--){
            for (int j=arr.length-1; j>i; j--){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
