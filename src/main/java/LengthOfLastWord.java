/**
 * Created by jliang1 on 10/11/17.
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 For example,
 Given s = "Hello World",
 return 5.


 *
 * https://leetcode.com/problems/length-of-last-word/description/
 *
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s == null)
            return 0;

        String[] split = s.split(" ");
        if (split.length == 0)
            return 0;
        return split[split.length-1].length();
    }

}
