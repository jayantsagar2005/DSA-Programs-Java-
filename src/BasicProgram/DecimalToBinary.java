package BasicProgram;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 10;
        StringBuilder ans = new StringBuilder();

        if(n == 0){
            ans.append(0);
        }
        while(n != 0){
            int r = n % 2;
            ans.append(r);
            n = n / 2;
        }

        ans.reverse();

        System.out.println(ans);


    }
}
