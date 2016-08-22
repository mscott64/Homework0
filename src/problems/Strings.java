package problems;

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
        /* Implement this */
        return "";
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
        /* Implement this */
        return false;
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
        /* Implement this */
        return 0;
    }
}
