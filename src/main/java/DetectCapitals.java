/**
 * Created by jliang1 on 10/24/17.
 *
 * Given a word, you need to judge whether the usage of capitals in it is right or not.

 We define the usage of capitals in a word to be right when one of the following cases holds:

 All letters in this word are capitals, like "USA".
 All letters in this word are not capitals, like "leetcode".
 Only the first letter in this word is capital if it has more than one letter, like "Google".
 Otherwise, we define that this word doesn't use capitals in a right way.
 Example 1:
 Input: "USA"
 Output: True
 Example 2:
 Input: "FlaG"
 Output: False
 Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.

 https://leetcode.com/problems/detect-capital/description/
 */
public class DetectCapitals {

    public boolean detectCapitalUse(String word) {
        if (word.toUpperCase().equals(word) || word.toLowerCase().equals(word))
            return true;
        String a = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        if (a.equals(word))
            return true;

        return false;
    }
}
