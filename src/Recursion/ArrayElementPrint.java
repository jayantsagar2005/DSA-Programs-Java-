package Recursion;

public class ArrayElementPrint {

    public static void print(int[] arr, int n) {
        if(n==-1){
            return;
        }

        print(arr, n-1);
        System.out.print(arr[n]+" ");
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,8,9,10};

        print(arr,arr.length-1);
    }
}
