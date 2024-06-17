package Array_2D;

public class largestElement {
    public static void main(String[] args) {
        int[][] array = {{102,25,42},{85,75,9},{10,74,701}};

        int max = array[0][0];

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
               if (max<array[i][j]){
                   max = array[i][j];
               }
            }
        }

        System.out.println("The largest element is : "+max);
    }
}
