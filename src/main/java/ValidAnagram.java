import java.util.Arrays;

/**
 * Created by jliang1 on 10/11/17.
 *
 * Given two strings s and t, write a function to determine if t is an anagram of s.

 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.

 Note:
 You may assume the string contains only lowercase alphabets.



 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int[] s1 = new int[256];
        int[] t1 = new int[256];

        for (int i = 0; i < s.length(); i++)
            s1[s.charAt(i)]++;

        for (int i = 0; i < t.length(); i++)
            t1[t.charAt(i)]++;

        return Arrays.equals(s1, t1);
    }

}
