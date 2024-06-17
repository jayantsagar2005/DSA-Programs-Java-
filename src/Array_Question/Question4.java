package Array_Question;

// WAP to find the duplicate elements from the given array of elements.

public class Question4 {

    public static void main(String[] args) {

       int[] array = {4,3,2,7,8,2,3,1};


        int[] ans = new int[array.length];

        for (int i=0; i<array.length; i++){
            int temp = array[i];

            for (int j=i+1; j<array.length; j++){
                if (temp==array[j]){
                    ans[i] = temp;
                }
            }
        }

        for (int ele : ans) {
            System.out.print(ele+" ");
        }

    }
}
