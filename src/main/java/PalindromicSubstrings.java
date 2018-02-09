import java.util.ArrayList;

/**
 * Created by jliang1 on 11/13/17.
 *
 * Given a string, your task is to count how many palindromic substrings in this string.

 The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

 Example 1:
 Input: "abc"
 Output: 3
 Explanation: Three palindromic strings: "a", "b", "c".
 Example 2:
 Input: "aaa"
 Output: 6
 Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

 https://leetcode.com/problems/palindromic-substrings/description/

 */
public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        ArrayList<String> a = new ArrayList();

        for (int length = 1; length < s.length()+1; length++) {
            for (int start = 0; start < s.length()+1; start++) {
                String sub = (start+length < s.length()) ? s.substring(start, start+length) : s.substring(start);
System.out.println("start : end : sub = " + start + " : " + (start +length) + ":" + sub);
                StringBuilder sb = new StringBuilder(sub);


                if (sub.length() > 0 && sub.equals(sb.reverse().toString()))
                    a.add(sub);
            }
        }
        return a.size();
    }

    public static void main(String[] a) {
        PalindromicSubstrings p = new PalindromicSubstrings();
        System.out.println(p.countSubstrings("abc"));
    }
}
