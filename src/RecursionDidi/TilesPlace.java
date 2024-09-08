package RecursionDidi;

public class TilesPlace {
    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        int ans = placeTiles(n, m);
        System.out.println(ans);
    }

    public static int placeTiles(int n, int m) {
        if (n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }

        int vertical = placeTiles(n-m, m);
        int horizontal = placeTiles(n-1, m);

        return vertical + horizontal;
    }
}
