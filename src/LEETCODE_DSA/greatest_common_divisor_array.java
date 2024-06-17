package LEETCODE_DSA;

public class greatest_common_divisor_array {
    public static void main(String[] args) {
        int[] array = {7,5,6,8,3};

        int result = gcd(array);

        System.out.println("GCD = "+result);
    }

    public static int gcd(int[] array) {
        int min = array[0];
        for(int i=0; i<array.length-1; i++){
            if (min>array[i+1]){
                min = array[i+1];
            }
        }
        System.out.println("Min = "+min);
        int max = array[0];
        for(int i=0; i<array.length-1; i++){
            if (max<array[i+1]){
                max = array[i+1];
            }
        }
        System.out.println("Max = "+max);

        int hcf = 1;

        for (int i=1; i<=min; i++){
            if (min%i==0 && max%i==0){
                hcf = i;
            }
        }
        return hcf;
    }
}
