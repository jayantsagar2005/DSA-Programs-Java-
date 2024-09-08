package RecursionDidi;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,6,7};
        boolean ans = isSorted(arr, 0);
        System.out.println(ans);
    }

    public static boolean isSorted(int[] arr, int n) {
        if(n == arr.length-1) return true;
        if(arr[n] > arr[n+1]){
            return false;
        }
        return isSorted(arr, n+1);
    }
}
