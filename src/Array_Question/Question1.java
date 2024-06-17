package Array_Question;

// Calculate the product of all the elements in the given array.

public class Question1 {
    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5,7};
//        int[] array = {};
        int[] array = {-1,2,3,-4,-5};

        int product = 1;

        if (array.length == 0){
            System.out.println("Empty Array");
            return;
        }

        for (int i=0; i<array.length; i++){
            product = product * array[i];
        }

        System.out.println("Product is : "+product);


    }
}
