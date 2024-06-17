package Array_Question;

// If an array arr contains n elements, then check if the given array is a palindrome or not .

public class Question12 {

    public static void main(String[] args) {

//        int[] array = {1,2,3,4,5,4,3,2,1,};
        int[] array = {1,2,3,4,5,3,4,2,1};

        int i =0;
        int j = array.length-1;
        boolean flag = true;

        while (i<j){
            if (array[i]!=array[j]){
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if (!flag){
            System.out.println("This array is not palindrome.");
        }else {
            System.out.println("This array is palindrome.");
        }

    }
}
