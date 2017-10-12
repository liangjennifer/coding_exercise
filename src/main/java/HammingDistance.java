/**
 * Created by jliang1 on 10/11/17.
 *
 *
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

 Given two integers x and y, calculate the Hamming distance.

 Note:
 0 ≤ x, y < 231.

 https://leetcode.com/problems/hamming-distance/description/
 */
public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] arg) {
System.out.println(HammingDistance.hammingDistance(5, 8));
    System.out.println(">>> " + Integer.highestOneBit(67));
        System.out.println(">>> " + ((new Integer(34))).byteValue());
    }
}
