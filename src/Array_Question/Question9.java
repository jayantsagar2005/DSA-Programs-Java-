package Array_Question;

//Find the difference between the sum of elements at even indices to the sum of elements at odd indices.

public class Question9 {
    public static void main(String[] args) {

        int[] array = {8, 12, 14, 25, 26, 28, 41};

        int even = 0;
        int odd = 0;

        for (int i=0; i<array.length; i++){
            if (array[i]%2==0){
                even = even + array[i];
            }else {
                odd = odd + array[i];
            }
        }
        int ans;

        if (even>odd){
            ans = even - odd;
        }else{
            ans = odd - even;
        }

        System.out.println("The difference of even sum and odd sum : "+ans);
    }
}
