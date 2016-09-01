package solution;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class Tests {

    @Test
    public void testMostCommon() throws Exception {
        assertEquals(1, DataStructures.mostCommon(new int[]{1, 2, 3, 2, 1, 4, 5}));
        assertEquals(8, DataStructures.mostCommon(new int[]{6, 7, 8, 4, 5, 6, 7, 8, 9, 8}));
        assertEquals(5, DataStructures.mostCommon(new int[]{1, 1, 2, 3, 4, 5, 5, 5}));
        assertEquals(1000, DataStructures.mostCommon(new int[]{1000, 50, 45, 50, 45, 1000}));
        assertEquals(0, DataStructures.mostCommon(new int[1])); // single entry
        assertEquals(0, DataStructures.mostCommon(new int[0])); // empty array
        assertEquals(0, DataStructures.mostCommon(null)); // null input
    }

    @Test
    public void testComputeThePattern() throws Exception {
        assertArrayEquals(new int[]{2}, DataStructures.computeThePattern(new int[]{1, 3, 5, 7, 9, 11}));
        assertArrayEquals(new int[]{2, 4}, DataStructures.computeThePattern(new int[]{1, 3, 7, 9, 13, 15, 19}));
        assertArrayEquals(new int[]{-1, -1, -2}, DataStructures.computeThePattern(new int[]{6, 5, 4, 2, 1, 0, -2}));
        assertArrayEquals(new int[]{2, 3, 2, -4, 21, -13},
                DataStructures.computeThePattern(new int[]{1, 3, 6, 8, 4, 25, 12}));
        assertArrayEquals(new int[0], DataStructures.computeThePattern(new int[1])); // single entry
        assertArrayEquals(new int[0],  DataStructures.computeThePattern(new int[0])); // empty array
        assertArrayEquals(new int[0],  DataStructures.computeThePattern(null)); // null input
    }

    @Test
    public void testCreateAsciiMap() throws Exception {
        Map<Character, Integer> map = Loops.createAsciiMap();
        assertEquals(52, map.size());
        assertEquals(66, map.get('B').intValue());
        assertEquals(83, map.get('S').intValue());
        assertEquals(97, map.get('a').intValue());
        assertEquals(109, map.get('m').intValue());
    }

    @Test
    public void testComputeSum() throws Exception {
        int[][] testArray1 = new int[][]{{0, 1, 2, 3}, {4, 5, 6, 7}};
        assertEquals(28, Loops.computeSum(testArray1));
        testArray1[0][0] = 100;
        testArray1[1][3] = 55;
        testArray1[0][2] = 27;
        testArray1[1][1] = 40;
        assertEquals(236, Loops.computeSum(testArray1));

        int[][] testArray2 = new int[][]{{1}, {2}, {3}};
        assertEquals(6, Loops.computeSum(testArray2));

        assertEquals(0, Loops.computeSum(new int[1][1])); // single entry
        assertEquals(0, Loops.computeSum(new int[0][0])); // empty array
        assertEquals(0, Loops.computeSum(null)); // null input
    }

    @Test
    public void testMapToString() throws Exception {
        HashMap<Character, Integer> testMap = new HashMap<Character, Integer>();
        testMap.put('a', 3);
        testMap.put('b', 2);
        testMap.put('c', 1);
        assertEquals("abcaba", Loops.mapToString(testMap));
        testMap.clear();
        testMap.put('a', 4);
        testMap.put('b', 6);
        testMap.put('c', 1);
        testMap.put('f', 2);
        assertEquals("abcfabfababbb", Loops.mapToString(testMap));
        testMap.clear();
        testMap.put('a', 5);
        assertEquals("aaaaa", Loops.mapToString(testMap)); // single entry
        assertEquals("", Loops.mapToString(new HashMap<Character, Integer>())); // empty map
        assertEquals("", Loops.mapToString(null)); // null input
    }

    @Test
    public void testToAcronym() throws Exception {
        assertEquals("HW", Strings.toAcronym("Hello, world!"));
        assertEquals("OLNLGIF", Strings.toAcronym("Okay ladies now let's get in formation"));
        assertEquals("DTMDCMJLMA", Strings.toAcronym("Don't text me. Don't call me. Just leave me alone."));
        assertEquals("GETA", Strings.toAcronym("Give 'em the axe!"));
        assertEquals("H", Strings.toAcronym("h")); // single element
        assertEquals("", Strings.toAcronym("")); // empty string
        assertEquals("", Strings.toAcronym(null)); // null string
    }

    @Test
    public void testIsPalindrome() throws Exception {
        assertEquals(false, Strings.isPalindrome("Hello, world!"));
        assertEquals(true, Strings.isPalindrome("Race car"));
        assertEquals(false, Strings.isPalindrome("Race scar"));
        assertEquals(true, Strings.isPalindrome("No 'x' in Nixon"));
        assertEquals(true, Strings.isPalindrome("An igloo! Cool, Gina!"));
        assertEquals(true, Strings.isPalindrome("1234321"));
        assertEquals(true, Strings.isPalindrome("h")); // single element
        assertEquals(true, Strings.isPalindrome("")); // empty string
        assertEquals(false, Strings.isPalindrome(null)); // null string
    }

    @Test
    public void testAlphabeticalCount() throws Exception {
        assertEquals(1, Strings.alphabeticalCount("Hello, world!"));
        assertEquals(2, Strings.alphabeticalCount("Have you heard ABBA?"));
        assertEquals(3, Strings.alphabeticalCount("I'm tired. Effort is futile."));
        assertEquals(0, Strings.alphabeticalCount("12345")); // no alphabetical characters
        assertEquals(1, Strings.alphabeticalCount("h")); // single element
        assertEquals(0, Strings.alphabeticalCount("")); // empty string
        assertEquals(0, Strings.alphabeticalCount(null)); // empty string
    }

}