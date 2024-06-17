package Array_Question;

// Count the number of triplets whose sum is equal to the given value x.

public class Question15 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 21;
        boolean flag = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (i != j && j != k && k != i) {
                        if (array[i] + array[j] + array[k] == x) {
                            System.out.println(i + "," + j + "," + k);
                            flag = false;
                            break;
                        }
                    }
                }
                if (!flag) {
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }

    }
}
