package BasicSorting;

public class checkArraySorted {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,9};
        boolean flag = true;

        for (int i=0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println("Sorted");
        }else{
            System.out.println("Unsorted");
        }
    }
}