/**
 * Created by jliang1 on 10/11/17.
 *
 *Reverse digits of an integer.

 Example1: x = 123, return 321
 Example2: x = -123, return -321

 click to show spoilers.

 Note:
 The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.


 *
 */


public class ReversInteger {

    public int reverse(int x) {
        boolean isNegative = x < 0;
        String a = "" + x;
        if (isNegative)
            a = a.substring(1);

        a = new StringBuilder(a).reverse().toString();

        try {
            int z = Integer.valueOf(a);
            if (isNegative)
                return 0-z;
            else
                return z;

        } catch (Exception e) {
            ;
        }
        return 0;
    }
}
