package problems;

import java.util.HashMap;
import java.util.Map;

public class Loops {

    /**
     * Create a map of each alphabetic character (A-Z,a-z) to its ASCII value.
     * @return the map
     *
     * A : 65
     * B : 66
     * ...
     * z : 122
     *
     * Remember that for-loops can use any primitive data type.
     */
    public static Map<Character, Integer> createAsciiMap() {
        /* Implement this */
        return new HashMap<Character, Integer>();
    }

    /**
     * Compute the sum of a 2-dimensional array of integers
     * @param input 2-dimension array of integers
     * @return sum of all values in the array
     *
     * For example:
     * [[0 1 2 3]
     *  [4 5 6 7]]  => 28
     * [[1]
     *  [2]
     *  [3]] => 6
     */
    public static int computeSum(int[][] input) {
        /* Implement this */
        return 0;
    }

    /**
     * Create a string using all of the character keys from the input map.
     * Each character should appear however many times the map suggests
     * after cycling through all of the characters in alphabetical order.
     * Input map will only contain keys a-z.
     *
     * @param characterAppearance number of times each character should appear
     * @return all of the characters in single string
     *
     * For example:
     * {a:3, b:2, c:1} => "abcaba"
     * {a:4, d:2, c:3, b:6, f:2} => "abcdfabcdfabcabbb"
     * {} => ""
     *
     * Helpful method:
     * Collections.sort(List<T> list);
     */
    public static String mapToString(Map<Character, Integer> characterAppearance) {
        /* Implement this */
        return "";
    }
}
