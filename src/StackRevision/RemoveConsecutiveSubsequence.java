package StackRevision;

import java.util.Stack;

public class RemoveConsecutiveSubsequence {

    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static int[] remove(int[] arr) {

        int n = arr.length;

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n-1; i++){
            if (st.isEmpty()) st.push(arr[i]);
            else if (st.peek() == arr[i]){
                if (arr[i] != arr[i+1]){
                    st.pop();
                }
            }else{
                st.push(arr[i]);
            }
        }



        if(st.peek() == arr[n-1]){
            st.pop();
        }else {
            st.push(arr[n-1]);
        }

        int[] ans = new int[st.size()];


        int i = 0;
        while(!st.isEmpty()){
            ans[i] = st.pop();
            i++;
        }

        reverse(ans);

        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,7};

        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();

        int[] ans = remove(arr);

        for (int ele : ans) {
            System.out.print(ele+" ");
        }



    }
}
