package Array_Question;

//  Find the second largest element in the given Array in one pass.

public class Question2 {
    public static void main(String[] args) {

        int[] array = {8,12,37,2,49,16,28,21};

        int first = array[0];
        int second = array[1];

        int max = Math.max(first,second);
        int min = Math.min(first,second);

        first = max;
        second = min;

        for (int i=2; i<array.length; i++){
            if (first<array[i]){
                second = first;
                first = array[i];
            } else if (second<array[i]) {
                second = array[i];
            }
        }

        System.out.println("Second largest element is : "+second);

    }
}
