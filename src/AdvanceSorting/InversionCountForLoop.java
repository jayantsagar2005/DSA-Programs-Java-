package AdvanceSorting;

import java.util.Arrays;

public class InversionCountForLoop {
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};

        int ans = 0;
        int n = arr.length;

        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    ans++;
                }
            }
        }

        Arrays.sort(arr);

        System.out.println("Total inversion count : "+ans);
    }
}
