package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class DataStructures {

    /**
     * Given an array of integers, return the integer that appears the most.
     * If there is a tie for most common, then return the integer that
     * appeared first in the array.
     *
     * @param input an array of integers
     * @return the integer that appeared the most
     *
     * For example:
     * [1, 2, 3, 2, 1, 4, 5] => 1
     * [6, 7, 8, 4, 5, 6, 7, 8, 9, 8] => 8
     * [] => 0
     */
    public static int mostCommon(int[] input) {
        if (input == null) {
            return 0;
        }
        // This is type of HashMap keeps the keys in order.
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < input.length; i++) {
            int key = input[i];
            if (map.containsKey(key)) {
                // If the key is already in the map, add 1 to its value
                map.put(key, map.get(key) + 1);
            } else {
                // Add this key to the map.
                map.put(key, 1);
            }
        }
        // The integer that appears the most.
        int mostCommon = 0;
        // The number of times the most common integer appears.
        int mostCommonCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > mostCommonCount) {
                mostCommon = entry.getKey();
                mostCommonCount = entry.getValue();
            }
        }
        return mostCommon;
    }

    /**
     * Given an array of integers, return the computation pattern
     * using as few integers as possible.
     *
     * @param input array of integers with some pattern
     * @return the shortest possible pattern as an array
     *
     * For example:
     * [1, 3, 5, 7, 9, 11] => [2]
     * [1, 3, 7, 9, 13, 15, 19] => [2, 4]
     * [6, 5, 4, 2, 1, 0, -2] => [-1, -1, -2]
     * [1, 3, 6, 8, 4, 25, 12] => [2, 3, 2, -4, 21, -13]
     *
     * Helpful method:
     * Arrays.copyOfRange(int[] arr, int from, int to)
     */
    public static int[] computeThePattern(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        // Compute the difference between each pair of input values
        // and store those differences in an array.
        int[] diffs = new int[input.length - 1];
        for (int i = 0; i < input.length - 1; i++) {
            diffs[i] = input[i + 1] - input[i];
        }
        // Test each possible pattern, starting with the shortest.
        for (int i = 1; i < diffs.length; i++) {
            if (testPattern(diffs, i)) {
                return Arrays.copyOfRange(diffs, 0, i);
            }
        }
        return diffs;
    }

    /**
     * Returns true if the pattern from 0 to endIndex is repeated
     * throughout diffs.
     */
    private static boolean testPattern(int[] diffs, int endIndex) {
        int[] pattern = Arrays.copyOfRange(diffs, 0, endIndex);
        // Check that every pattern.length entries match the pattern.
        for (int i = 0; i < diffs.length; i += pattern.length) {
            // Check if the values in diff match the values in pattern.
            for (int j = 0; j < pattern.length && i + j < diffs.length; j++) {
                if (pattern[j] != diffs[i + j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
