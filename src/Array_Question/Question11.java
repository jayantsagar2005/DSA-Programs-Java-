package Array_Question;

//Find the unique number in a given Array where all the elements are being repeated twice with one value being unique.

public class Question11 {
    public static void main(String[] args) {

        int[] array = {1,2,3,3,2,4,4};

        int count = 0;

        for (int i=0; i<array.length; i++){
            count = 0;
            for (int j=0; j<array.length; j++){
                if (array[i]==array[j]){
                    if (i!=j){
                        System.out.println();
                        count++;
                    }
                }
            }
            if (count == 0){
                System.out.println(array[i]);
            }
        }

    }
}
