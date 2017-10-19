/**
 * Created by jliang1 on 10/13/17.
 *
 *
 *Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 Example 1:
 Input: "Let's take LeetCode contest"
 Output: "s'teL ekat edoCteeL tsetnoc"
 Note: In the string, each word is separated by single space and there will not be any extra space in the string.

 https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 *
 */
public class ReverseWordsInStringIII {

    public String reverseWords(String s) {

        String[] sa = s.split(" ");
        for (int j = 0; j < sa.length; j++) {
            StringBuilder sb = new StringBuilder();
            char[] c = sa[j].toCharArray();
            for (int i = c.length-1; i >= 0; i-- )
                sb.append(c[i]);
            sa[j] = sb.toString();
        }

        StringBuilder sb = new StringBuilder();
        for (String a : sa) {
            sb.append(a);
            sb.append(" ");
        }

        return sb.toString().trim();
    }

}
