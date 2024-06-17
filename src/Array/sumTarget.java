package Array;

public class sumTarget {
    public static void main(String[] args) {

        int[] arr = {1,4,7,8,9,4,5,6};
        int target = 14;

        int[] ans = sunTwoElements(arr,target);


        for (int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }

    }

    public static int[] sunTwoElements(int[] array, int target) {

        int[] ans = new int[2];

        for (int i=0; i<array.length-1; i++){
            for (int j=i+1; j<array.length; j++){
                if (array[i] + array[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }

        return ans;
    }
}
