package StackRevision;

import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        int n = arr.length-1;

        ans[n] = -1;
        st.push(arr[n]);

        for(int i=n-1; i>=0; i--){
            int val = arr[i];
            if(val < st.peek()){
                ans[i] = st.peek();
                st.push(arr[i]);
            }else{
                while (!st.isEmpty() && val >= st.peek()){
                    st.pop();
                }

                if(st.isEmpty()){
                    ans[i] = -1;
                    st.push(arr[i]);
                }else{
                    ans[i] = st.peek();
                    st.push(arr[i]);
                }

            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7};
        int[] ans = nextElement(arr);

        for (int ele : ans) {
            System.out.print(ele+" ");
        }
    }
}
