package RecursionDidi;

public class PhoneKeyboardCom {
    static String[] arr = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void print(String str, int idx, String com) {
        if(idx == str.length()){
            System.out.println(com);
            return;
        }
        char ch = str.charAt(idx);
        String mapping = arr[ch-'0'];

        for(int i=0; i<mapping.length(); i++){
            print(str, idx+1, com+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        print(str, 0, "");
    }
}
