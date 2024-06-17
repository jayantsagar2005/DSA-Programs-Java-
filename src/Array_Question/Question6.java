package Array_Question;

// Count the number of elements strictly greater than x.

public class Question6 {
    public static void main(String[] args) {
        int[] array = {8,12,37,49,16,28,21};

        int[] ans = new int[array.length];

        for (int i=0; i<array.length; i++){

            int temp = array[i];
            int count = 0;

            for (int j=0; j<array.length; j++){
                if (temp<array[j]){
                    count++;
                }
            }

            ans[i] = count;

        }

        for (int ele: ans) {
            System.out.print(ele+" ");
        }
    }
}
