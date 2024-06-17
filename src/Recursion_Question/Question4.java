package Recursion_Question;

//Print all the elements of an array in reverse order.

public class Question4 {
    public static void main(String[] args) {

        int[] arr = {70,80,40,50,71,60,90,44,55,12};
        print(arr);
        reverseArray(arr,0);

    }

    public static void print(int[] arr){
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr, int n) {
        if(n == arr.length){
            return;
        }
        reverseArray(arr,n+1);
        System.out.print(arr[n]+" ");
    }
}
