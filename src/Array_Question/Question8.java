package Array_Question;

public class Question8 {
    public static void main(String[] args) {
//        int[] array = {8,12,37,49,16,28,21};

        int[] array = {8,12,14,25,26,28,41};

        boolean flag = true;

        for (int i=0; i<array.length-1; i++){

            for (int j=i+1; j<array.length; j++){
                if (array[i]>array[j]){
                    flag = false;
                    break;
                }
            }
        }

        if (flag){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted.");
        }
    }
}
