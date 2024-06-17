package BasicSorting;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};

        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
