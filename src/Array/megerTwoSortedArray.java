package Array;

public class megerTwoSortedArray {
    public static void main(String[] args) {

        int[] arr1 = {1,3,5,7,15,30,35};
        int[] arr2 = {2,4,6,8,11,20,55};

        int i = 0;
        int j = 0;
        int k = 0;

        int size = arr1.length+arr2.length;

//        System.out.println(size);

        int[] ans = new int[size];


        while (i<arr1.length && j<arr2.length){

            if (arr1[i]<arr2[j]){
                ans[k] = arr1[i];
                i++;
            }else{
                ans[k] = arr2[j];
                j++;
            }
             k++;

        }

        if (arr1.length<=arr2.length){
            for (int l=j; l<arr2.length; l++){
                ans[k] = arr2[l];
                k++;
            }
        }else{
            for (int l=i; l<arr1.length; l++){
                ans[k] = arr1[l];
                k++;
            }
        }

        for (int ele: ans) {
            System.out.println(ele+" ");
        }



    }
}
