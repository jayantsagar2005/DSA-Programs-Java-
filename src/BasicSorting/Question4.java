package BasicSorting;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        String[] arr = {"shobit","shivani","sujal","subhash","shivam","shiv","simran"};

//        Arrays.sort(arr);

        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-i; j++){
                if(arr[j].compareTo(arr[j+1]) > arr[j+1].compareTo(arr[j])){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (String str : arr){
            System.out.print(str+" ");
        }
    }
}
