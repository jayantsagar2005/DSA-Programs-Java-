package Array_Question;

// WAP to find the smallest missing positive element in the sorted Array. (take the array as input)

public class Question5 {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 7, 8};
        boolean flag = false;

        int j = array[0];

        for (int i = j; i < array.length; i++) {
            if ((i+1)!=array[i]){
                System.out.println("The smallest missing number is : "+(i+1));
                break;
            }

        }

    }
}
