package Array;

public class nextGreatestElement {
    public static void main(String[] args) {
         int[] arr = {12,8,41,37,2,49,16,28,21};

         int[] ans = new int[arr.length];

         for (int i = 0; i<arr.length-1; i++){
             int max = arr[i+1];
             for (int j=i+1; j<arr.length; j++){
                 if(max<arr[j]){
                     max = arr[j];
                 }
             }
             ans[i] = max;
         }

         ans[ans.length-1] = -1;

        for (int ele: ans) {
            System.out.print(ele+" ");
        }


    }
}
