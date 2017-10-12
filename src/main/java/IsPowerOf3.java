/**
 * Created by jliang1 on 10/11/17.
 *
 * https://leetcode.com/problems/power-of-two/description/
 *
 * Given an integer, write a function to determine if it is a power of two.
 *
 */
public class IsPowerOf3 {
    public static boolean isPowerOfThree(int n) {
        //return n>0 && (n==1 || (n%3==0 && isPowerOfThree(n/3)));

        double i = 0;
        int c = 0;
        while (i < n && i != n) {

            i = (double) Math.pow((double)3, (double)c );
            c++;
        }

        return i == n;
    }

    public static void main(String[] args) {
        System.out.println(">>> " + IsPowerOf3.isPowerOfThree(81));
    }
}
