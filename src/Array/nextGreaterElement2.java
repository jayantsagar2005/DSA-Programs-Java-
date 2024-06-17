package Array;

public class nextGreaterElement2 {
    public static void main(String[] args) {

        int[] arr = {12,8,41,37,2,49,16,28,21};

        int[] ans = new int[arr.length];

        ans[ans.length-1] = -1;

        for (int i=arr.length-2; i>=0; i--){
            int temp1 = arr[i+1];
            int temp2 = ans[i+1];
            int max = Math.max(temp1,temp2);
            ans[i] = max;
        }

        for (int ele: ans) {
            System.out.print(ele+" ");
        }


    }
}
