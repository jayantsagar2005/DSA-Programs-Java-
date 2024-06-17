package BinarySearch;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClosestElement {

    public static void sort(List<Integer> ans) {

        for (int i = 0; i < ans.size() - 1; i++) {
            for (int j = 0; j < ans.size() - 1 - i; j++) {
                if (ans.get(j) > ans.get(j + 1)) {
                    int temp = ans.get(j);
                    ans.set(j, ans.get(j + 1));
                    ans.set(j + 1, temp);
                }
            }
        }

    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        ArrayList<Integer> ans = new ArrayList<>();

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {

                ans.add(arr[mid]);

                int a = mid - 1;
                int b = mid + 1;


                for (int i = 0; i < k-1; i++) {

                    if (a < 0) {
                        for (int j = i; j<k-1; j++){
                            ans.add(arr[b]);
                            b++;
                        }
                        sort(ans);
                        return ans;
                    }
                    if (b >= arr.length) {
                        for (int j = i; j<k-1; j++){
                            ans.add(arr[a]);
                            a--;
                        }
                        sort(ans);
                        return ans;
                    }

                    int diff1 = Math.abs(x - arr[a]);
                    int diff2 = Math.abs(x - arr[b]);

                    if (diff1 == diff2) {
                        ans.add(arr[a]);
                        a--;
                    } else if (diff1 < diff2) {
                        ans.add(arr[a]);
                        a--;
                    } else {
                        ans.add(arr[b]);
                        b++;
                    }

                }

                sort(ans);

                return ans;

            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        int lowerBound = arr.length;
        low = 0;
        high = arr.length - 1;

        while (low<=high){
            int mid = (low+high)/2;

            if (arr[mid] >= x){
                lowerBound = Math.min(lowerBound,mid);
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }

        int a = lowerBound - 1;
        int b = lowerBound;

        for (int i = 0; i < k; i++) {

            if (a < 0) {
                for (int j = i; j<k; j++){
                    ans.add(arr[b]);
                    b++;
                }
                sort(ans);
                return ans;
            }
            if (b >= arr.length) {
                for (int j = i; j<k; j++){
                    ans.add(arr[a]);
                    a--;
                }
                sort(ans);
                return ans;
            }

            int diff1 = Math.abs(x - arr[a]);
            int diff2 = Math.abs(x - arr[b]);

            if (diff1 == diff2) {
                ans.add(arr[a]);
                a--;
            } else if (diff1 < diff2) {
                ans.add(arr[a]);
                a--;
            } else {
                ans.add(arr[b]);
                b++;
            }

        }

        sort(ans);
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};
        int k = 4;
        System.out.print("Enter the target value : ");
        int x = sc.nextInt();

        System.out.println(findClosestElements(arr, k, x));


    }

}
