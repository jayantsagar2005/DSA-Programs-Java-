package Recursion;

public class PreInPost {

    public static void print(int n) {
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);

        System.out.print(n+" ");
        print(n-1);

        System.out.print(n+" ");

    }

    public static void main(String[] args) {
        int n = 3;

        print(n);
    }
}
