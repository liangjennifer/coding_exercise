/**
 * Created by jliang1 on 10/13/17.
 *
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

 Each letter in the magazine string can only be used once in your ransom note.

 Note:
 You may assume that both strings contain only lowercase letters.

 canConstruct("a", "b") -> false
 canConstruct("aa", "ab") -> false
 canConstruct("aa", "aab") -> true

 https://leetcode.com/problems/ransom-note/description/
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(magazine);

        for (char a : ransomNote.toCharArray()) {
            int indx = sb.indexOf(""+a);
            if (indx < 0)
                return false;
            sb.deleteCharAt(indx);
        }
        return true;
    }

    public static void main(String[] arg) {
        RansomNote.canConstruct("a", "b");
    }
}
