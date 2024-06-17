package Array_Question;

// Given an array of integers, change the value of all odd indexed elements to its second multiple and
//increment all even indexed values by 10.
public class Question10 {

    public static void main(String[] args) {

        int[] array = {8, 12, 14, 25, 26, 28, 41};

        for (int i=0; i<array.length; i++){
            if (i%2==0){
                array[i] += 10;
            }else{
                array[i] *= 2;
            }
        }

        for (int ele: array) {
            System.out.print(ele+" ");
        }

    }

}
