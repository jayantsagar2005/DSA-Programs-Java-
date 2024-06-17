package Array_Question;

// Find the minimum value out of all elements in the array.

public class Question3 {
    public static void main(String[] args) {

        int[] array = {8,12,37,49,16,28,21};
//        int[] array = {};

        if (array.length==0){
            System.out.println("Empty array");
            return;
        }

        int min = array[0];

        for (int i=1; i<array.length; i++){
            if (min>array[i]){
                min = array[i];
            }
        }

        System.out.println("The minimum element is : "+min);

    }
}
