/**
 * Created by jliang1 on 10/11/17.
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;

        String stringX = "" + x;

        String reverseX = new StringBuilder(stringX).reverse().toString();

        if ( reverseX.equals(stringX))
            return true;
        else return false;
    }
}
