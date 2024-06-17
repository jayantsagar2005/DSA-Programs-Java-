package Array_Question;

public class Question4_2 {
    public static void main(String[] args) {

        int[] array = {4,3,2,7,8,2,3,1};
        int[] ans = new int[array.length];
        int j = 0;

        for (int i=0; i<array.length; i++){
            int idx = (Math.abs(array[i])-1);
            if (array[idx]<0){
                ans[j] = array[idx] * -1;
                j++;
            }else{
                array[idx] = array[idx] * -1;
            }
        }

        int k =0;
        while(ans[k]!=0){
            System.out.print(ans[k]+" ");
            k++;
        }


    }
}
