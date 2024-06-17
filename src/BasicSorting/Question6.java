package BasicSorting;


import java.util.Arrays;
;

public class Question6 {
    public static void main(String[] args) {

//        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        int[] arr = {5,3,0,7,4};

        Arrays.sort(arr);

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (int i=0; i<arr.length; i++){
            if (i%2==0){
                str1.append(arr[i]);
            }else{
                str2.append(arr[i]);
            }
        }

        int num1 = Integer.parseInt(String.valueOf(str1));
        int num2 = Integer.parseInt(String.valueOf(str2));

        System.out.println(num1 + num2);



    }
}
