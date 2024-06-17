package Array_2D;

public class searchElement {
    public static void main(String[] args) {
        int[][] array = {{102, 25, 42}, {85, 75, 9}, {10, 74, 701}};
        int key = 20;
        boolean flag = false;

        for (int i=0; i<array.length; i++){
            if (flag){
                break;
            }
            for (int j=0; j<array[i].length; j++){
                if(array[i][j] == key){
                    flag = true;
                    break;
                }
            }
        }

        System.out.println(flag);

    }
}
