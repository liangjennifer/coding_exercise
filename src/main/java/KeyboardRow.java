import java.util.ArrayList;

/**
 * Created by jliang1 on 10/11/17.
 *
 * https://leetcode.com/problems/keyboard-row/description/
 *
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 *
 * Example 1:
 Input: ["Hello", "Alaska", "Dad", "Peace"]
 Output: ["Alaska", "Dad"]
 Note:
 You may use one character in the keyboard more than once.
 You may assume the input string will only contain letters of alphabet.
 */
public class KeyboardRow {

    public String[] findWords(String[] words) {
        String FirstRow = "QWERTYUIOP";
        String SecondRow = "ASDFGHJKL";
        String ThirdRow = "ZXCVBNM";
        ArrayList<String> stringArray = new ArrayList();

        for (String w : words) {
            char[] c = w.toUpperCase().toCharArray();
            int firstCount = 0;
            int secondCount = 0;
            int thirdCount = 0;
            for (char i : c) {
                if (FirstRow.indexOf(i) >= 0)
                    firstCount++;
                if (SecondRow.indexOf(i) >= 0)
                    secondCount++;
                if (ThirdRow.indexOf(i) >= 0)
                    thirdCount++;

            }
            if (firstCount == w.length() || secondCount == w.length() || thirdCount == w.length())
                stringArray.add(w);
        }

        String[] s = new String[stringArray.size()];
        return stringArray.toArray(s);
    }
}
