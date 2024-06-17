package BinarySearch;

//        Given a matrix having 0-1 only where each row is sorted in increasing order, find the row with the
//        maximum number of 1’s.

public class Question3 {

    public static int maxOneRow(int[][] arr) {
        int[] ans = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            int low = 0;
            int high  = arr[i].length-1;
            int lowerBond = arr[i].length;
            int count;
            while(low <= high){
                int mid = low + (high - low) / 2;
                if(arr[i][mid] >= 1){
                    lowerBond = Math.min(lowerBond,mid);
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
            count = arr[i].length - lowerBond;
            ans[i] = count;
        }
        int max = ans[0];
        int idx = 0;
        for(int i=0; i<ans.length; i++){
            if(max < ans[i]){
                max = ans[i];
                idx = i;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[][] arr = { {0,1,1,1},
                        {0,0,1,1},
                        {1,1,1,1},
                        {0,0,0,0} };



        int ans = maxOneRow(arr);

        System.out.println(ans);
    }
}
