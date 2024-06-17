package RecursionRevision;

import java.util.ArrayList;
import java.util.List;

public class IncreasingSequence {

    public static void main(String[] args) {
        int n = 6;
        int k = 4;
        printIncreasingSequences(n, k);
    }

    public static void printIncreasingSequences(int n, int k) {
        List<Integer> combination = new ArrayList<>();
        generateCombinations(n, k, 1, combination);
    }

    private static void generateCombinations(int n, int k, int start, List<Integer> combination) {
        if (combination.size() == k) {
            System.out.println(combination);
            return;
        }

        for (int i = start; i <= n; i++) {
            combination.add(i);
            generateCombinations(n, k, i + 1, combination);
            combination.remove(combination.size() - 1);
        }
    }

}
