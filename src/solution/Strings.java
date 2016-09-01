package solution;

import java.util.StringTokenizer;

public class Strings {

    /**
     * Converts a given input string to its acronym by splitting on spaces.
     * Only alphabetical characters should be included in the acronym.
     * @param input the string to be converted
     * @return the converted string
     *
     * For example:
     * "Hello, world!" => "HW"
     * "Okay ladies now let's get in formation" => "OLNLGIF"
     * "Don't text me. Don't call me. Just leave me alone." => "DTMDCMJLMA"
     * "Give 'em the axe!" => "GETA"
     *
     * Helpful methods and classes:
     * StringTokenizer
     * Character.isLetter(char ch)
     */
    public static String toAcronym(String input) {
        if (input == null) {
            return "";
        }
        StringTokenizer st = new StringTokenizer(input, " ");
        StringBuilder sb = new StringBuilder();
        // Go through all of the available words.
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            for (int i = 0; i < token.length(); i++) {
                // Find the first viable character to be added to the acronym.
                char c = token.charAt(i);
                if(Character.isLetter(c)) {
                    sb.append(Character.toUpperCase(c));
                    break;
                }
            }
        }
        return sb.toString();
    }

    /**
     * Returns true if the input string is a palindrome.
     * A palindrome is a word, phrase, number, or other sequence of
     * characters which reads the same backward or forward.
     *
     * @param input the string to be tested
     * @return true if the string is a palindrome
     *
     * For this assignment, "A" and "a" are equals.
     * Punctuation (and other non-letter and non-digit characters) can be ignored.
     *
     * For example:
     * "Hello, world!" => false
     * "Race car" => true
     * "No 'x' in Nixon" => true
     * "An igloo! Cool, Gina!" => true
     * "1234321" => true
     *
     * Helpful method:
     * Character.isLetterOrDigit(char ch)
     */
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String simplified = simplifyInput(input);
        int length = simplified.length();
        for (int i = 0; i < length / 2; i++) {
            // Compare each character to its mirror character.
            if (simplified.charAt(i) != simplified.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Removes all non-letter and non-digit characters
     * and makes all alphabetical characters lowercase.
     */
    private static String simplifyInput(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    /**
     * Counts the longest alphabetical substring and returns its length
     * ignoring all non-alphabetical characters. Capital vs lowercase makes no difference.
     * @param input the string to be tested
     * @return the length of the longest alphabetical string
     *
     * For example:
     * "Hello, world!" => 1
     * "Have you heard ABBA?" => 2 for "AB"
     * "I'm tired. Effort is futile." => 3 for "d. Ef" (which has only 3 letters)
     */
    public static int alphabeticalCount(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String simplified = simplifyInput2(input);
        // If there are no characters in simplified, then the max count is 0,
        // but if there is at least one character, the count starts at 1.
        if (simplified.isEmpty()) {
            return 0;
        }
        int maxCount = 1;
        int count = 1;
        for (int i = 1; i < simplified.length(); i++) {
            char curr = simplified.charAt(i);
            char prev = simplified.charAt(i - 1);
            if (curr - prev == 1) { // These are in alphabetical order.
                count++;
                if (count > maxCount) {
                    // Update maxCount if needed.
                    maxCount = count;
                }
            } else { // These characters are not in order, so reset the count.
                count = 1;
            }

        }
        return maxCount;
    }

    /**
     * Removes all non-letter characters and makes all letters lowercase.
     */
    private static String simplifyInput2(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}
