package solution;

import java.util.*;

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
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char i = 'A'; i <= 'Z'; i++) {
            map.put(i, (int)i);
            char lowercase = Character.toLowerCase(i);
            map.put(lowercase, (int)lowercase);
        }
        return map;
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
        if (input == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                sum += input[i][j];
            }
        }
        return sum;
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
        if (characterAppearance == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        // Store a list of all of the available characters in keyList.
        ArrayList<Character> keyList = new ArrayList<Character>(characterAppearance.keySet());
        // Sort that list.
        Collections.sort(keyList);

        int keyIndex = 0;
        while(!characterAppearance.isEmpty()) {
            char key = keyList.get(keyIndex);
            if (characterAppearance.containsKey(key)) { // Then it may still need to be added to the string.
                int remaining = characterAppearance.get(key);
                if (remaining > 0) {
                    sb.append(key); // Add it to the string.
                    characterAppearance.put(key, remaining - 1); // Decrement it's remaining count by 1.
                } else {
                    // Remove it from the map, so that we'll skip it from now on.
                    characterAppearance.remove(key);
                }
            }
            // Add 1 every time. And wrap around to 0 when it gets to keyList.size()
            keyIndex = (keyIndex + 1) % keyList.size();
        }
        return sb.toString();
    }
}
