package BasicSorting;

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int[] arr = {5,10,7,5,89,42,1,42,55,95,74,36};
        int k = 12;
        boolean flag = true;

//        bubble sort
//        for (int i=0; i<arr.length-1; i++){
//            for (int j=0; j<arr.length-1-i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    flag = false;
//                }
//            }
//            if (flag){
//                break;
//            }
//        }


//         selection sort
//        for (int i=0; i<arr.length; i++){
//            for (int j=i; j<arr.length; j++){
//                if (arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }

//        insertion sort
//

        Arrays.sort(arr);

        for (int ele : arr){
            System.out.print(ele+" ");
        }

        System.out.println(arr[k-1]);


    }
}
