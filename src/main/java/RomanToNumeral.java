/**
 * Created by jliang1 on 10/11/17.
 *
 * Given a roman numeral, convert it to an integer.

 Input is guaranteed to be within the range from 1 to 3999.

 */
public class RomanToNumeral {

    public enum Roman { I(1),IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);

        private int value;
        private Roman(int value) {
            this.value = value;
        }
    };


    public int romanToInt(String s) {



        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            if (b == 'I' && (i+1 != s.length())) {

                char c = s.charAt(i + 1);
                if (c == 'V' || c == 'X') {
                    Roman a = Roman.valueOf("" + b + c);
                    number += a.value;
                    i++;
                } else {
                    Roman a = Roman.valueOf(""+s.charAt(i));
                    number += a.value;
                }

            } else if (b == 'X' && (i+1 != s.length())) {
                char c = s.charAt(i+1);
                if (c == 'L' || c == 'C') {
                    Roman a = Roman.valueOf(""+b + c);
                    number += a.value;
                    i++;
                } else {
                    Roman a = Roman.valueOf(""+s.charAt(i));
                    number += a.value;
                }
            } else if (b == 'C' && (i+1 != s.length())) {
                char c = s.charAt(i+1);
                if (c == 'D' || c == 'M') {
                    Roman a = Roman.valueOf(""+b + c);
                    number += a.value;
                    i++;
                } else {
                    Roman a = Roman.valueOf(""+s.charAt(i));
                    number += a.value;
                }
            } else {
                Roman a = Roman.valueOf(""+s.charAt(i));
                number += a.value;

            }
        }

        return number;
    }

    public static void main(String[] arg) {
        RomanToNumeral r = new RomanToNumeral();
        System.out.println(r.romanToInt("IIVVII"));
    }
}
