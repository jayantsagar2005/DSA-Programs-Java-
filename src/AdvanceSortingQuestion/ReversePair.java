package AdvanceSortingQuestion;

public class ReversePair {
    public static void main(String[] args) {
        int[] arr = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        int ans = reversePairs(arr);
        System.out.println(ans);
    }

    public static int reversePairs(int[] arr) {
        int ans = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > 2 * arr[j]) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
