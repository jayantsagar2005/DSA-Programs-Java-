package RecursionRevision;

public class PrintArrayElement {
    public static void main(String[] args) {
        int[] arr = {1,2,7,8,4,6,9,5,2,10,8,4,6,3};

        System.out.print("Original Array : ");
        print(arr, 0);

        System.out.println();

        System.out.print("Reverse Array : ");
        printReverse(arr, 0);
    }

    public static void print(int[] arr, int idx) {
        if(idx == arr.length){
            return;
        }

        System.out.print(arr[idx]+" ");
        print(arr, idx+1);
    }
    public static void printReverse(int[] arr, int idx) {
        if(idx == arr.length){
            return;
        }

        printReverse(arr, idx+1);
        System.out.print(arr[idx]+" ");
    }
}
