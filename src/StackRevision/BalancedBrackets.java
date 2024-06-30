package StackRevision;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean balanced(String s) {
        int n = s.length();
        if(n%2 == 1){
            return false;
        }
        Stack<Character> st = new Stack<>();

        for (int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '(') st.push(')');
            if(ch == '{') st.push('}');
            if(ch == '[') st.push(']');

            if (ch == ')'){
                if (st.isEmpty()) return false;
                if(st.peek() != ch) return false;
                st.pop();
            }

            if (ch == '}'){
                if (st.isEmpty()) return false;
                if(st.peek() != ch) return false;
                st.pop();
            }

            if (ch == ']'){
                if (st.isEmpty()) return false;
                if(st.peek() != ch) return false;
                st.pop();
            }
        }

        return st.isEmpty();


    }
    public static void main(String[] args) {
        String str = "([)]";

        boolean ans = balanced(str);
        System.out.println(ans);
    }
}
