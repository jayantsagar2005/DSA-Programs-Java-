package BasicSorting;

public class Question2 {
    public static void main(String[] args) {
//        int[] arr = {3,1,2,5,4};
        int[] arr = {1,1,2,3,4};

        boolean flag = true;

        for (int i=0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }

        if (!flag){
            System.out.print("Array is not sorted");
        }else{
            System.out.print("Array is sorted");
        }
    }
}
