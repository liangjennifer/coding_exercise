/**
 * Created by jliang1 on 10/11/17.
 *
 * https://leetcode.com/problems/power-of-two/description/
 *
 * Given an integer, write a function to determine if it is a power of two.
 *
 */
public class IsPowerOf2 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        return Integer.bitCount(n) == 1;
    }
}
