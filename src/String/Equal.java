package String;

public class Equal {
    public static void main(String[] args) {
        String names = "Happy";
        String names1 = "Happy";
        String names2 = new String("Happy");

        if(names.equals(names1)){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }

        if(names.equals(names2)){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }

        if(names1.equals(names2)){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }
    }
}
