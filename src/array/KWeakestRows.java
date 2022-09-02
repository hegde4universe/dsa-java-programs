package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KWeakestRows {

    public static void main(String[] args) {

        int[][] mat = {{1, 1, 1},
                {1, 0, 0},
                {1, 1, 0},
                {1, 1, 1}
        };
        System.out.println(Arrays.toString(kWeakestRows(mat, 2)));

    }

    private static int[] kWeakestRows(int[][] mat, int k) {

        HashMap<Integer, Integer> sumOfMt = new HashMap<Integer, Integer>();
        int[] weakestRows;

        for (int i = 0; i < mat.length; i++) {
            sumOfMt.put(i, Arrays.stream(mat[i]).sum());
        }

        weakestRows = sumOfMt.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .mapToInt(Map.Entry::getKey)
                .limit(k)
                .toArray();

        return weakestRows;

    }

}
