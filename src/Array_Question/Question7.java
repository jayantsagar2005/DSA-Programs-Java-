package Array_Question;

// WAP to find the largest three elements in the array.

import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        int[] array = {8,12,37,49,16,28,21};

        Arrays.sort(array);

        for (int i=array.length-3; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
