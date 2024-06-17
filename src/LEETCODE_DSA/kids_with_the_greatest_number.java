package LEETCODE_DSA;

public class kids_with_the_greatest_number {
    public static void main(String[] args) {
        int[] candies ={12,1,12};
        int extraCandies = 10;

        boolean[] list = kidsWithCandies(candies,extraCandies);

        for(int i=0; i<candies.length; i++){
            System.out.print(list[i] + ", ");
        }
    }

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i=0; i<candies.length-1; i++){
            if (max<candies[i+1]){
                max = candies[i+1];
            }
        }
        System.out.println("Max = "+max);

        int temp = 0;
        boolean[] list = new boolean[candies.length];
        for (int i=0; i<candies.length; i++){
            temp = candies[i] + extraCandies;
            if (temp>=max){
                list[i] = true;
            }else {
                list[i] = false;
            }
            temp = 0;
        }

        return list;
    }
}
