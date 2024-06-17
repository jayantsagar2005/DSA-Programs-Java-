package BinarySearch;

public class KoKoProblem {

    public static void main(String[] args) {
//        int[] arr = {30,11,23,4,20};
//        int h = 6;
        int[] arr = {312884470};
        int h = 312884470;

        int ans = minEatingSpeed(arr,h);

        System.out.println(ans);

    }

    public static int minEatingSpeed(int[] arr, int h) {
        int min = arr[0];
        int max = arr[0];

        System.out.println(min);
        System.out.println(max);

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        int low = 1;
        int high = max;
        int ans = 0;



        while(low <= high){

            int mid = low + (high - low) / 2;

            int hours = calculateTime(arr,mid,h);

            if(hours <= h){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return ans;

    }

    public static int calculateTime(int[] arr, int mid, int h){

        int sum = 0;
        int div = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%mid==0){
                div = arr[i]/mid;
            }else{
                div = arr[i]/mid + 1;
            }
            sum = sum + div;
        }

        return sum;
    }

}
